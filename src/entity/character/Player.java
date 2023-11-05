package entity.character;

import entity.Pickup;
import entity.consumable.food.Food;
import entity.consumable.valuable.Valuable;
import entity.open.Openable;
import entity.open.Opener;
import entity.weidables.FistsOfFury;
import entity.weidables.Wieldable;
import gameplay.Inventory;

public class Player extends Character {

    private final String name;
    private int confidence;

    private Wieldable weapon;
    private Wieldable defaultWeapon;
    private Inventory inventory;

    public Player(String name, int health, int confidence) {
        super(name, health);
        this.name = name;
        this.health = health;
        this.confidence = confidence;
        this.weapon = null;
        this.inventory = new Inventory();
        this.defaultWeapon = new FistsOfFury("fistsofFury", 5, 10);
    }

    @Override
    protected int dealAttackDamage() {
        int h = weapon.hit();
        return h + h * confidence / 100;
    }

    @Override
    public int defendAttack(Character enemy) {
        int d = enemy.dealAttackDamage();
        health -= d;
        health = Math.max(0, health);
        confidence -= d / 2;
        confidence = Math.max(0, confidence);
        return d;
    }


    public boolean hasWeapon() {
        return weapon != null;
    }

    public void wieldWeapon(String weaponName) {
        if (defaultWeapon.compareID(weaponName)) {
            this.weapon = defaultWeapon;
            System.out.println("player wield [ " + defaultWeapon.getDescription() + " ] weapon.");
        } else {
            Pickup weapon = this.inventory.select(weaponName);
            boolean existsWeapon = (weapon instanceof Wieldable);
            if (!existsWeapon) {
                System.out.println("The weapon [ " + weaponName + " ] Not Exists in Inventory.");
            } else {
                Wieldable w = (Wieldable) weapon;
                this.weapon = w;
                System.out.println("player wield [ " + w.getDescription() + " ] weapon.");
            }
        }
    }

    public void admire(String valuableName) {
        Pickup[] items = this.inventory.getItems();
        boolean fined = false;
        boolean consumed = false;
        for (Pickup pickup : items) {
            if (pickup.compareID(valuableName)) {
                if (pickup instanceof Valuable valuable) {
                    fined = true;
                    if (!valuable.isConsumed()) {
                        consumed = true;
                        int c = valuable.consumed();
                        this.confidence += c;
                        System.out.println("player increase [ " + c + " ] confidence");
                        break;
                    }
                }
            }
        }

        if (!fined) {
            System.out.println("valuable [ " + valuableName + " ] Not Exists in Inventory.");
            return;
        }
        // find item but not consumed!
        if (!consumed) {
            System.out.println("The item " + valuableName + " has been used.");
        }
    }


    public void pickUpItem(Pickup p) {
        this.inventory.add(p);
    }

    public String getName() {
        return name;
    }


    public void eat(String foodName) {
        Pickup food = this.inventory.select(foodName);
        boolean existsFood = (food instanceof Food);
        if (!existsFood) {
            System.out.println("The food [ " + foodName + " ] Not Exists in Inventory.");
            return;
        }
        Food f = (Food) food;
        int hp = f.consumed();
        this.health += hp;
        this.inventory.remove(f);
        System.out.println("player increase [ " + hp + " ] health.");
    }

    public void showStats() {
        System.out.println("=== current info ===");
        System.out.println("health: " + this.health);
        System.out.println("confidence: " + this.confidence);
        System.out.println("inventory: " + this.inventory.toString());
        System.out.println("weapon: " + (this.weapon == null ? "nothing" : weapon.getDescription()));
    }

    public void openChest(String chestName) {
        // check chest exist!
        Pickup p = this.inventory.select(chestName);

        boolean existsChest = (p instanceof Openable);

        if (!existsChest) {
            System.out.println("The chest [ " + chestName + " ] Not Exists in Inventory.");
            return;
        }

        Openable chest = (Openable) p;

        Pickup[] items = this.inventory.getItems();

        Opener key = null;

        for (Pickup item : items) {
            if (item instanceof Opener opener) {
                if (chest.canOpen(opener)) {
                    key = opener;
                    break;
                }
            }
        }

        // find key
        if (key == null) {
            System.out.println("The chest [ " + chestName + " ] no corresponding key in the inventory");
            return;
        }

        // open it!
        Pickup item = chest.unlockWith(key);
        // remove key and chest
        this.inventory.remove(chest);
        this.inventory.remove(key);
        // add item
        this.inventory.add(item);

        System.out.println("chest [ " + chestName + " ] has been opened. Obtain item [ " + item.getDescription() + " ]");
    }

    public void showCanUseWeapon() {
        System.out.println("=== Can Use Weapon ===");
        defaultWeapon.showWieldInfo();
        Pickup[] items = this.inventory.getItems();
        for (Pickup item : items) {
            if (item instanceof Wieldable w) {
                w.showWieldInfo();
            }
        }
    }
}
