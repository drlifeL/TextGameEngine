package gameplay;

import antlr.gamemap.GameMapLexer;
import antlr.gamemap.GameMapParser;
import entity.Entity;
import entity.Pickup;
import entity.character.Monster;
import entity.convert.GameMap;
import entity.convert.RoomDeclaration;
import entity.convert.RoomEnter;
import entity.convert.RoomExit;
import entity.convert.RoomItem;
import entity.convert.RoomLink;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import process.AntlrToGameMap;
import process.SyntaxErrorListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class ReadWorldDataFile {

    private static String enterRoom;

    private static String exitRoom;

    private static Map<String, List<String>> roomLinkMap = new HashMap<>();

    private static Map<String, List<Pickup>> roomPickupMap = new HashMap<>();

    private static Map<String, List<Monster>> roomMonsterMap = new HashMap<>();

    private static Set<String> roomNames = new HashSet<>();

    private static Map<String, Room> roomMap = new HashMap<>();


    /**
     * Static method to read a text file containing
     * a basic World to be played by the Game Engine
     */
    public static World basicWorld(String fileName) {

        GameMapParser parser = getParser(fileName);

        //read a basic map from a text file and
        //use antlr to parse and construct a World object.
        return buildWorld(parser);
    }

    /**
     * buildWorld
     *
     * @param parser
     * @return
     */
    private static World buildWorld(GameMapParser parser) {

        GameMapParser.GameMapContext antlrAST = parser.gameMap();

        if (SyntaxErrorListener.hasError()) {
            // syntaxError Not Parse!
            throw new RuntimeException("init World Error!");

        } else {
            AntlrToGameMap gameMapVisitor = new AntlrToGameMap();

            GameMap gameMap = gameMapVisitor.visit(antlrAST);

            if (gameMapVisitor.hasSemanticErrors()) {
                // SemanticError
                gameMapVisitor.showSemanticErrors();
                throw new RuntimeException("init World Error!");
            } else {
                // parse and build world!
                List<Entity> entities = gameMap.getEntities();
                loadBaseInfo(entities);

                // build room
                for (String roomName : roomNames) {
                    List<String> roomLinks = roomLinkMap.getOrDefault(roomName,Collections.emptyList());
                    List<Pickup> pickups = roomPickupMap.getOrDefault(roomName, Collections.emptyList());
                    List<Monster> monsters = roomMonsterMap.getOrDefault(roomName,Collections.emptyList());

                    // build pickups
                    Inventory inventory = new Inventory();
                    if (pickups != null && pickups.size() > 0) {
                        for (Pickup pickup : pickups) {
                            inventory.add(pickup);
                        }
                    }

                    Room[] connectingRooms = new Room[roomLinks.size()];

                    Room room = new Room(roomName, inventory, connectingRooms);

                    if (monsters != null && monsters.size() > 0) {
                        Monster[] monstersArr = new Monster[monsters.size()];
                        for (int i = 0; i < monsters.size(); i++) {
                            monstersArr[i] = monsters.get(i);
                        }
                        room.setMonsters(monstersArr);
                    }

                    // set final Room
                    room.setFinalRoom(Objects.equals(exitRoom, roomName));

                    roomMap.put(roomName, room);
                }

                // set Link Room
                for (Map.Entry<String, List<String>> roomEntry : roomLinkMap.entrySet()) {
                    String roomName = roomEntry.getKey();
                    List<String> linkRoomNames = roomEntry.getValue();

                    Room room = roomMap.get(roomName);

                    Room[] connectedRooms = room.getConnectedRooms();

                    // setting value
                    for (int i = 0; i < linkRoomNames.size(); i++) {
                        connectedRooms[i] = roomMap.get(linkRoomNames.get(i));
                    }
                }
            }
        }
        return new World(roomMap.get(enterRoom));
    }

    /**
     * load Base Info
     *
     * @param entities
     */
    private static void loadBaseInfo(List<Entity> entities) {
        for (Entity entity : entities) {
            if (entity instanceof RoomDeclaration roomDeclaration) {
                roomNames.add(roomDeclaration.getDescription());
            } else if (entity instanceof RoomEnter roomEnter) {
                enterRoom = roomEnter.getRoomName().getDescription();
            } else if (entity instanceof RoomExit roomExit) {
                exitRoom = roomExit.getRoomName().getDescription();
            } else if (entity instanceof RoomLink roomLink) {
                String sourceRoomName = roomLink.getSource().getDescription();
                String targetRoomName = roomLink.getTarget().getDescription();
                List<String> roomLinks = roomLinkMap.computeIfAbsent(sourceRoomName, k -> new ArrayList<>());
                roomLinks.add(targetRoomName);
            } else if (entity instanceof RoomItem roomItem) {
                String roomName = roomItem.getRoomName().getDescription();
                List<Entity> items = roomItem.getRoomItem();
                // currentRoomItems
                List<Pickup> pickups = new ArrayList<>();
                // currentRoomMonsters
                List<Monster> monsters = new ArrayList<>();
                for (Entity item : items) {
                    if (item instanceof Pickup pickup) {
                        pickups.add(pickup);
                    } else if (item instanceof Monster monster) {
                        monsters.add(monster);
                    }
                }

                if (pickups.size() > 0) {
                    roomPickupMap.put(roomName, pickups);
                }

                if (monsters.size() > 0) {
                    roomMonsterMap.put(roomName, monsters);
                }

            }
        }
    }


    /**
     * get parser
     *
     * @param fileName
     * @return
     */
    private static GameMapParser getParser(String fileName) {
        GameMapParser parser = null;

        try {
            CharStream input = CharStreams.fromFileName(fileName);
            GameMapLexer laxer = new GameMapLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(laxer);

            parser = new GameMapParser(tokens);

            // syntax error handling!
            parser.removeErrorListeners();
            parser.addErrorListener(new SyntaxErrorListener());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return parser;
    }

}
