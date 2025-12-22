package com.mycompany.classs;

import java.util.UUID;

/**
 * Charecter
 */
public abstract class Charecter {
    private String name;
    private final UUID ID = UUID.randomUUID();
    private double health;
    private Inventory inventory = new Inventory();

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getID() {
        return ID;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    /**
     * Displays this Charecter's inventory
     */
    public void displayInventory() {
        System.out.println(inventory);
    }

}
