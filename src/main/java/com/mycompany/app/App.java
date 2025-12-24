package com.mycompany.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            Command cmd;
            System.out.print("\n> ");
            String input = scanner.nextLine();

            if (input.equals("start"))
                break;

            try {
                cmd = new Command(input);
                cmd.parse();

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        }

        GameDefinition.execute();
        System.out.println(GameStates.getSeed());
        System.out.println(GameStates.getPlayer());
        scanner.close();
        // game init function
        // GameStates.initGame();
    }
}
