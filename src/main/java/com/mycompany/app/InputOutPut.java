package com.mycompany.app;

import java.util.Scanner;

/**
 * InputOutPut
 */
public class InputOutPut {

    private static Scanner input;

    /**
     * Returns String the user enterd.
     */
    public static String inputString() {
        input = new Scanner(System.in);
        return input.next();
    }

    /**
     * Returns line of String the user enterd.
     */
    public static String inputStringLine() {
        input = new Scanner(System.in);
        return input.nextLine();
    }
}
