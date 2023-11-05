package entity.convert;

import entity.Entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author TODO
 * @since 2023/10/21
 */
public class GameMap extends Entity {

    private final List<Entity> entities;

    public GameMap() {
        super("GameMap");
        this.entities = new ArrayList<>();
    }


    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    public List<Entity> getEntities() {
        return Collections.unmodifiableList(this.entities);
    }
}
