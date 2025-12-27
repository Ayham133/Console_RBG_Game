package com.mycompany.classs;

import com.mycompany.app.GameStates;
import com.mycompany.enums.Rarity;

/**
 * RangeWeapons
 */
public class RangeWeapons extends Weapons {

    private final Item THROWABLES;

    public RangeWeapons(String name, Rarity rarity, double damage, Item THROWABLES) {
        super(name, rarity, damage);
        this.THROWABLES = THROWABLES;
    }

    @Override
    public double dealDamage() {
        if (GameStates.getPlayer().getInventory().contains(THROWABLES.getID()))
            return 25;
        else
            return 0;
    }
}
