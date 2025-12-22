package com.mycompany.app;

import java.util.UUID;

/**
 * Charecter
 */
public abstract class Charecter {
    private String name;
    private final UUID ID = UUID.randomUUID();
    private double health;
}
