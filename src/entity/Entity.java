package entity;

import java.util.Random;

/**
 * @author TODO
 * @since 2023/10/7
 */
public abstract class Entity {

    private final String id;

    private String description;

    public Entity(String description) {
        this.id = this.getClass().getSimpleName();
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    protected int getRandomNumber(int x, int y) {
        return new Random().nextInt(y - x) + x;
    }

    public boolean compareID(String str) {
        return this.id.equalsIgnoreCase(str);
    }

    @Override
    public String toString() {
        return this.id;
    }
}
