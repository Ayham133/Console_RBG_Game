package com.mycompany.classs;

import com.mycompany.enums.Rarity;

/**
 * Weapons
 */
public class Weapons extends Item {
    private double damage;

    public Weapons(String name, Rarity rarity, double damage) {
        super(name, rarity, false, 1);
        this.damage = damage;
    }

    public double dealDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
