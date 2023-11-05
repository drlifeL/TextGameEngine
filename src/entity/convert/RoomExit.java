package entity.convert;

import entity.Entity;

/**
 * @author TODO
 * @since 2023/10/21
 */
public class RoomExit extends Entity {

    private final RoomName roomName;

    public RoomExit(String description, RoomName roomName) {
        super(description);
        this.roomName = roomName;
    }

    public RoomName getRoomName() {
        return roomName;
    }
}
