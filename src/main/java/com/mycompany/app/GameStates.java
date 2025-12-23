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
        Scanner input = new Scanner(System.in);
        String playerName;

        System.out.print("Enter ur name: ");
        playerName = input.nextLine();
        player = new Player(playerName, 100);

        input.close();
        return true;
    }

}
