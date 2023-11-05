package entity.consumable;

import entity.Pickup;

/**
 * @author TODO
 * @since 2023/10/7
 */
public abstract class Consumable extends Pickup {


    protected boolean consumed;

    public Consumable(String description) {
        super(description);
        this.consumed = false;
    }

    public boolean isConsumed() {
        return consumed;
    }

    public abstract int consumed();
}
