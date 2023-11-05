package gameplay;

import entity.Entity;
import entity.Pickup;
import entity.character.Monster;

/**
 * @author TODO
 * @since 2023/10/7
 */
public class Room extends Entity {

    private boolean isFinalRoom;

    private final Room[] connectedRooms;

    private Monster[] monsters;

    private final Inventory pickupsInRoom;

    public Room(String description, Inventory pickupsInRoom, Room[] connectingRooms) {
        super(description);
        this.pickupsInRoom = pickupsInRoom;
        this.connectedRooms = connectingRooms;
    }


    public Pickup getAndRemoveItem(String itemName) {
        Pickup item = this.pickupsInRoom.select(itemName);
        if (item != null) {
            this.pickupsInRoom.remove(item);
        }
        return item;
    }

    public Room findConnectionRoom(String roomName) {

        for (Room connectedRoom : this.connectedRooms) {
            if (roomName.equals(connectedRoom.getDescription())) {
                return connectedRoom;
            }
        }

        return null;
    }


    public boolean isFinalRoom() {
        return isFinalRoom;
    }

    public void setFinalRoom(boolean finalRoom) {
        isFinalRoom = finalRoom;
    }

    public Room[] getConnectedRooms() {
        return connectedRooms;
    }

    public Monster[] getMonsters() {
        return monsters;
    }

    public void setMonsters(Monster[] monsters) {
        this.monsters = monsters;
    }

    public void showRoomDescribe() {
        System.out.println("Pickups:" + pickupsInRoom.toString());

        // connection room Names
        Room[] connectedRooms = this.getConnectedRooms();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < connectedRooms.length; i++) {
            sb.append(connectedRooms[i].getDescription());
            sb.append(" , ");
        }
        System.out.println("Connected rooms:" + sb);
    }

}
