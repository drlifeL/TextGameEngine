package entity.convert;

import entity.Entity;

import java.util.List;

/**
 * @author TODO
 * @since 2023/10/21
 */
public class RoomItem extends Entity {


    private final List<Entity> roomItem;

    private final RoomName roomName;

    public RoomItem(String description, RoomName roomName, List<Entity> roomItem) {
        super(description);
        this.roomName = roomName;
        this.roomItem = roomItem;

    }

    public List<Entity> getRoomItem() {
        return roomItem;
    }

    public RoomName getRoomName() {
        return roomName;
    }
}
