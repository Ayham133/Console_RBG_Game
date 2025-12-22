package com.mycompany.classs;

import java.util.UUID;

import com.mycompany.enums.Rarity;

/**
 * Item
 */
public abstract class Item {
    private final UUID ID = UUID.randomUUID();
    private String name;
    private Rarity rarity;
    private boolean STACKABLE;
    private int quantity;

    public UUID getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public boolean isSTACKABLE() {
        return STACKABLE;
    }

    public void setSTACKABLE(boolean sTACKABLE) {
        STACKABLE = sTACKABLE;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
