package com.mycompany.classs;

import com.mycompany.enums.Rarity;

/**
 * Wearables
 */
public class Wearables extends Item {
    private double damageReduction;

    public Wearables(String name, Rarity rarity, double damageReduction) {
        super(name, rarity, false, 1);
        this.damageReduction = damageReduction;
    }

    public double getDamageReduction() {
        return damageReduction;
    }

    public void setDamageReduction(double damageReduction) {
        this.damageReduction = damageReduction;
    }

}
