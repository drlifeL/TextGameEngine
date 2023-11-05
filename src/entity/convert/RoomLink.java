package entity.convert;

import entity.Entity;

/**
 * @author TODO
 * @since 2023/10/21
 */
public class RoomLink extends Entity {

    private final RoomName source;

    private final RoomName target;

    public RoomName getSource() {
        return source;
    }

    public RoomName getTarget() {
        return target;
    }

    public RoomLink(String description, RoomName source, RoomName target) {
        super(description);
        this.source = source;
        this.target = target;
    }
}
