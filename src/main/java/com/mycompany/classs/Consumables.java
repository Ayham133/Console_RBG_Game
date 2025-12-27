package com.mycompany.classs;

import com.mycompany.enums.Rarity;

/**
 * Consumables
 */
public abstract class Consumables extends Item {
    private double healthReplanition;

    public Consumables(String name, Rarity rarity, boolean STACKABLE, int qunatity, double healthReplanition) {
        super(name, rarity, STACKABLE, qunatity);
        this.healthReplanition = healthReplanition;
    }

    public double getHealthReplanition() {
        return healthReplanition;
    }

    public void setHealthReplanition(double healthReplanition) {
        this.healthReplanition = healthReplanition;
    }

}
