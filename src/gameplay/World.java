
package gameplay;

import antlr.command.PlayerCommandLexer;
import entity.Pickup;
import entity.character.Monster;
import entity.character.Player;
import entity.consumable.food.Food;
import entity.consumable.valuable.Valuable;
import entity.weidables.FistsOfFury;
import entity.weidables.Wieldable;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class World {
    public enum PlayMode {battle, explore;}

    Player player;
    PlayMode mode;
    Room currentRoom;

    List<Monster> currentRoomMonsters = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public World(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    //--------------------------------------------------------

    /**
     * When the player enters a room, the following events occur:
     * <pre>
     *     - A monster may randomly appear (and go to battle mode)
     *     - A description of the room is displayed
     * </pre>
     */
    public void onEnterRoom() {
        mode = PlayMode.explore;
        // clean up
        currentRoomMonsters.clear();
        Monster[] monsters = currentRoom.getMonsters();
        if (monsters != null && monsters.length > 0) {
            // room has monster
            for (int i = 0; i < monsters.length; i++) {
                if (monsters[i].appear()) {
                    currentRoomMonsters.add(monsters[i]);
                    // ready to battle!
                    mode = PlayMode.battle;
                }
            }
        }
        System.out.println("You enter in Room [ " + currentRoom.getDescription() + " ]");
    }


    //--------------------------------------------------------
    public void play(Player player) {
        this.player = player;
        System.out.println("Welcome player " + player.getName());

        this.onEnterRoom();

        boolean gameInProgress = true;
        while (gameInProgress) {
            System.out.println();
            gameInProgress = switch (this.mode) {
                case explore -> processExploreUserInput();
                case battle -> processBattleUserInput();
            };
        }
        sc.close();
    }

    private boolean processBattleUserInput() {
        System.out.println("Battle Model!");

        boolean result = true;

        player.showCanUseWeapon();

        System.out.print("input cmd:");
        String input = sc.nextLine();
        PlayerCommandLexer lexer = getPlayerCommandLexer(input);
        // convert to lower case
        String cmd = lexer.nextToken().getText().toLowerCase();


        switch (cmd) {
            case "attack" -> {
                if (!player.hasWeapon()) {
                    System.out.println("player Not has Weapon,Please wield.");
                } else {
                    Monster monster = currentRoomMonsters.get(0);
                    int playerLossHp = player.defendAttack(monster);
                    int monsterLossHp = monster.defendAttack(player);
                    System.out.println("Player Loss [ " + playerLossHp + " ] remaining Hp: [ " + player.showHp() + " ]");
                    System.out.println("Monster Loss [ " + monsterLossHp + " ] remaining Hp: [ " + monster.showHp() + " ]");
                    if (!monster.isAlive()) {
                        currentRoomMonsters.remove(monster);
                    }

                    if (!player.isAlive()) {
                        System.out.println("Game over. You're dead!");
                        result = false;
                    }

                    if (currentRoomMonsters.size() == 0) {
                        System.out.println("Nice! You defeated the monster!");
                        this.mode = PlayMode.explore;
                    }
                }

            }
            case "wield" -> {
                String weaponName = lexer.nextToken().getText();
                player.wieldWeapon(weaponName);
            }
            case "help" -> this.showBattleModelHelper();
            default -> System.err.println("cmd Error,Type the help command to see help");
        }

        return result;
    }

    private void showBattleModelHelper() {
        System.out.println("============================");
        System.out.println("attack: Attacks the monster in the room using the wielded weapon");
        System.out.println("wield weapon: Player wields weapon from inventory for battle");
        System.out.println("wield fistsoffury: Player wields fists of fury ( does not appear in inventory )");
        System.out.println("help: Displays commands in this mode");
        System.out.println("============================");
    }

    private static PlayerCommandLexer getPlayerCommandLexer(String input) {
        CodePointCharStream stream = CharStreams.fromString(input);
        return new PlayerCommandLexer(stream);
    }

    private boolean processExploreUserInput() {
        System.out.println("Explore Model!");
        boolean result = true;

        System.out.print("input cmd:");
        String input = sc.nextLine();
        PlayerCommandLexer lexer = getPlayerCommandLexer(input);
        // convert to lower case
        String cmd = lexer.nextToken().getText().toLowerCase();

        switch (cmd) {
            case "door" -> {
                String roomName = lexer.nextToken().getText();
                Room connectionRoom = currentRoom.findConnectionRoom(roomName);
                if (connectionRoom == null) {
                    System.err.println("current Room Not Connected " + roomName);
                } else {
                    currentRoom = connectionRoom;
                    this.onEnterRoom();
                }
            }
            case "pickup" -> {
                String itemName = lexer.nextToken().getText();
                Pickup item = this.currentRoom.getAndRemoveItem(itemName);
                if (item == null) {
                    System.out.println("Error：pike up item not exists in this room!");
                } else {
                    this.player.pickUpItem(item);
                    System.out.println("You PickUp [ " + itemName + " ]");
                }
            }
            case "exit" -> {
                if (currentRoom.isFinalRoom()) {
                    System.out.println("Congratulation! Find exit , You Win!");
                    result = false;
                } else {
                    System.out.println("No exit found!");
                }
            }
            case "describe" -> currentRoom.showRoomDescribe();
            case "admire" -> {
                String valuableName = lexer.nextToken().getText();
                player.admire(valuableName);
            }
            case "eat" -> {
                String foodName = lexer.nextToken().getText();
                player.eat(foodName);
            }
            case "stats" -> player.showStats();
            case "wield" -> {
                String wieldName = lexer.nextToken().getText();
                player.wieldWeapon(wieldName);
            }
            case "open" -> {
                String chestName = lexer.nextToken().getText();
                player.openChest(chestName);
            }
            case "help" -> this.showExploreModelHelper();
            default -> System.out.println("cmd Error,Type the help command to see help");
        }

        return result;
    }

    private void showExploreModelHelper() {
        System.out.println("============================");
        System.out.println("Open n: " + "Opens door labeled n and enter the room");
        System.out.println("pickup item: " + "Pick up an item in room and add to inventory");
        System.out.println("exit: " + "Search room to find exit.");
        System.out.println("describe: " + "Describes the room,list pickups on the floor and number of doors available");
        System.out.println("admire valuableName: " + "Admire a valuableName pickup in the inventory to increase confidence. The valuableName may only be used once to increase confidence, but is not removed from the player’s inventory.");
        System.out.println("eat food: " + "Eats a food pickup in the inventory to increase health points.Once eaten, the food is removed from the player’s inventory.");
        System.out.println("stats: " + "Display player health and confidence points and inventory");
        System.out.println("wield weapon: " + "Player wields weapon from inventory for battle");
        System.out.println("wield fistsoffury: " + "Player wields fists of fury ( does not appear in inventory )");
        System.out.println("open chest: " + "Opens a treasure or war chest in the inventory.The contents of the chest is placed in the player’s inventory and the chest removed.");
        System.out.println("help: Displays commands in this mode");
        System.out.println("============================");


    }
}
