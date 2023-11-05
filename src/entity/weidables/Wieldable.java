package entity.weidables;

import entity.Pickup;

/**
 * @author TODO
 * @since 2023/10/7
 */
public abstract class Wieldable extends Pickup {

    protected int high;

    protected int low;

    public Wieldable(String description, int low, int high) {
        super(description);
        this.low = low;
        this.high = high;
    }

    public int hit() {
        return getRandomNumber(low, high);
    }

    public void showWieldInfo() {
        System.out.println("Name: [ " + this.getDescription() + " ] high: [ " + this.high + " ] low: [ " + this.low + " ]");
    }
}
