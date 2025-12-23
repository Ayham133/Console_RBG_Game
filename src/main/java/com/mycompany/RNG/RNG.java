package com.mycompany.RNG;

import java.util.Random;

/**
 * RNG
 */
public class RNG {

    private static Random random;

    public static void init(long seed) {
        random = new Random(seed);
    }

}
