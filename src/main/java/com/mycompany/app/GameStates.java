package com.mycompany.app;

import java.util.Scanner;

import com.mycompany.classs.*;

/**
 * GameStates
 */
public class GameStates {

    public static Player player;

    /**
     * Initieat the game
     *
     * @return true if the Initieation prosesse goes will, false otherwise.
     */
    public static boolean initGame() {
        String playerName = inputPlayerName();

        return true;
    }

    /**
     * Returns the playerName.
     * 
     * @return ther playerName.
     */
    public static String inputPlayerName() {
        System.out.print("Enter ur name: ");
        String playerName = InputOutPut.inputStringLine();

        return playerName;
    }

}
