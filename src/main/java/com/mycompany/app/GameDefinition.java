package com.mycompany.app;

import com.mycompany.classs.Player;

/**
 * GameDeffenition
 */
public class GameDefinition {

    public static Player player;
    public static Long seed;

    /**
     * execute the game deffenition to the gaem states.
     */
    public static void execute() {
        if (player != null)
            GameStates.setPlayer(new Player(player.getName(), player.getHealth()));
        else
            GameStates.setPlayer(new Player());

        if (seed != null)
            GameStates.setSeed(seed);
        else
            GameStates.setSeed(System.currentTimeMillis());
    }
}
