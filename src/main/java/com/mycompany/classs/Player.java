package com.mycompany.classs;

/**
 * Player
 */
public class Player extends Charecter {

    public Player(String name, double health) {
        super(name, health);
    }

    public Player() {

    }

    /**
     * dispalayInfo
     */
    @Override
    public void displayInfo() {
        StringBuilder str = new StringBuilder("[");
        str.append("\"" + getName() + "\"");
        str.append(", " + getHealth());
        str.append("]");

        System.out.println(str.toString());
    }

    /**
     * displayAbsInfo
     */
    @Override
    public void displayAbsInfo() {
        System.out.println(this);
    }

    public void setPlayerHealth(double health) {
        if (health <= 0 || health > 100) {
            this.setHealth(100);
            return;
        }
        this.setHealth(health);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(this.getClass() + "[");
        str.append("\"" + getName() + "\"");
        str.append(", " + getHealth());
        str.append(", " + getInventory());
        str.append("]");

        return str.toString();
    }
}
