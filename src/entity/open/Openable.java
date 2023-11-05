package entity.open;

import entity.Pickup;

/**
 * @author TODO
 * @since 2023/10/19
 */
public abstract class Openable extends Pickup {

    protected boolean locked;

    protected Pickup contents;

    public Openable(String description, Pickup contents) {
        super(description);
        this.locked = true;
        this.contents = contents;
    }

    public Pickup unlockWith(Opener key) {
        if (canOpen(key)) {
            this.locked = false;
            return contents;
        } else {
            System.out.println("The key [ " + key.getDescription() + " ]" + "can't Open [ " + this.getDescription() + " ]");
        }
        return null;
    }

    public abstract boolean canOpen(Opener key);

}
