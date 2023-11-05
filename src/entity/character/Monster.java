package entity.character;

/**
 * @author TODO
 * @since 2023/10/7
 */
public abstract class Monster extends Character {

    private final int probability;

    private final int attackDamage;

    public Monster(String description, int healthPoints, int probability, int attackDamage) {
        super(description, healthPoints);

        if (probability < 0 || probability > 100) {
            throw new IllegalArgumentException("Probability must be between 0 and 100");
        }
        if (attackDamage < 0) {
            throw new IllegalArgumentException("Attack damage cannot be negative");
        }

        this.probability = probability;

        this.attackDamage = attackDamage;
    }


    public boolean appear() {
        if (health == 0) {
            return false;
        }
        return getRandomNumber(0, 101) <= probability;
    }

    @Override
    protected int dealAttackDamage() {
        return attackDamage + getRandomNumber(1, 11);
    }

    @Override
    public int defendAttack(Character enemy) {
        int lossHp = enemy.dealAttackDamage();
        this.health -= lossHp;
        this.health = Math.max(0, this.health);
        return lossHp;
    }
}
