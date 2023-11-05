package entity.open;

import entity.Pickup;

/**
 * @author TODO
 * @since 2023/10/19
 */
public class WarChest extends Openable {

    public WarChest(String description, Pickup contents) {
        super(description, contents);
    }


    @Override
    public boolean canOpen(Opener key) {
        return key instanceof LockPick;
    }
}
