package com.mycompany.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        // game deffenition by user input.
        GameDefinition def = new GameDefinition();

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
                System.out.println("parsing is done.");
                // cmd.execute();

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        }

        scanner.close();
        // game init function
        // GameStates.initGame();
    }
}
