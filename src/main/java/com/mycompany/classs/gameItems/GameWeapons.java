package com.mycompany.classs.gameItems;

import com.mycompany.classs.*;
import com.mycompany.enums.Rarity;

/**
 * GameWeapons
 * All the in game Weapons are in here
 */
public class GameWeapons {
    public static final Item SWAORD = new Weapons("Swaord", Rarity.COMMON, 15);

    public Item SWAORD() {
        return SWAORD;
    }

}
