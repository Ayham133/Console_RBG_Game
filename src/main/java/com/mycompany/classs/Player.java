package com.mycompany.classs;

/**
 * Player
 */
public class Player extends Charecter {

    public Player(String name, int health) {
        super(name, health);
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
