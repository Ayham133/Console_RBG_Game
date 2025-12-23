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

    Charecter(String name, double health) {
        this.name = name;
        this.health = health;
    }

    Charecter() {

    }

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
        if (health <= 0) {
            this.health = 100;
            return;
        }

        this.health = health;
    }

    /**
     * Displays this Charecter's inventory
     */
    public void displayInventory() {
        System.out.println(inventory);
    }

    /**
     * Displays this Charecter's info
     */
    public abstract void displayInfo();

    /**
     * Displays the absolot info about this Charecter includes the class.
     */
    public abstract void displayAbsInfo();

}
