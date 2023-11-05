package entity.consumable.valuable;


import entity.consumable.Consumable;

/**
 * @author TODO
 * @since 2023/10/7
 */
public abstract class Valuable extends Consumable {

    protected int value;

    public Valuable(String description, int value) {
        super(description);
        this.value = value;
    }

    @Override
    public int consumed() {
        if (isConsumed()) {
            System.out.println("The Item has been Consumed!");
            return 0;
        }
        this.consumed = true;
        return value;
    }
}
