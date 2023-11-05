package entity.consumable.food;

import entity.*;
import entity.consumable.Consumable;

/**
 * @author TODO
 * @since 2023/10/7
 */
public abstract class Food extends Consumable {

    protected int health;

    public Food(String description, int health) {
        super(description);
        this.health = health;
    }

    @Override
    public int consumed() {
        if (isConsumed()) {
            System.out.println("The Item has been Consumed!");
            return 0;
        }
        this.consumed = true;
        return health;
    }
}
