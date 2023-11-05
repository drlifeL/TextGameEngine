package gameplay;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<entity.Pickup> items;

    //------------------------------------
    public Inventory() {
        this.items = new ArrayList<entity.Pickup>();
    }

    //------------------------------------
    public String toString() {
        String out = "";
        for (entity.Pickup p : items) {
            if (p != null) {
                out += p + ",";
            }
        }
        if (out.isEmpty()) out = "nothing";
        return out;
    }

    //------------------------------------
    public entity.Pickup remove(String id) {
        entity.Pickup p = this.select(id);

        this.items.remove(p);

        return p;
    }

    //------------------------------------
    public entity.Pickup select(String id) {
        for (entity.Pickup p : this.items) {
            if (p != null && p.compareID(id)) {
                return p;
            }
        }
        return null;
    }

    //------------------------------------
    public void add(entity.Pickup p) {
        this.items.add(p);
    }

    //------------------------------------
    public void remove(entity.Pickup p) {
        this.items.remove(p);
    }

    //------------------------------------
    public entity.Pickup[] getItems() {
        entity.Pickup[] items = new entity.Pickup[this.items.size()];
        for (int i = 0; i < items.length; i++) {
            items[i] = this.items.get(i);
        }
        return items;
    }
}