package com.mycompany.classs;

import com.mycompany.app.GameStates;
import com.mycompany.classs.gameItems.GameWeapons;
import com.mycompany.enums.Rarity;

/**
 * RangeWeapons
 */
public class RangeWeapons extends Weapons {

    public RangeWeapons(String name, Rarity rarity, double damage) {
        super(name, rarity, damage);
    }

    @Override
    public double dealDamage() {
        if (GameStates.getPlayer().getInventory().contains(GameWeapons.SWAORD.getID()))
            return 25;
        else
            return 0;

    }
}
