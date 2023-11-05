package entity.character;

import entity.Entity;

/**
 * @author TODO
 * @since 2023/10/7
 */
public abstract class Character extends Entity {


    protected int health;


    public Character(String description, int healthPoints) {
        super(description);
        if (healthPoints < 0) {
            throw new IllegalArgumentException("Health points cannot be negative");
        }
        this.health = healthPoints;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public int showHp() {
        return this.health;
    }


    protected abstract int dealAttackDamage();

    public abstract int defendAttack(Character enemy);

}
