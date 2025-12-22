package com.mycompany.app;

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

}
