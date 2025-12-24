package com.mycompany.app;

import com.mycompany.classs.*;

/**
 * GameStates
 */
public class GameStates {

    private static Player player;
    private static Long seed;

    /**
     * Initieat the game
     *
     * @return true if the Initieation prosesse goes will, false otherwise.
     */
    public static boolean initGame() {
        if (player == null)
            player = new Player("Player", 100);

        if (seed == null)
            seed = System.currentTimeMillis();

        return true;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        GameStates.player = player;
    }

    public static Long getSeed() {
        return seed;
    }

    public static void setSeed(Long newSeed) {
        if (newSeed != null)
            seed = newSeed;
    }

}
