package com.mycompany.app;

import java.util.Scanner;
import com.mycompany.classs.*;
import com.mycompany.enums.Rarity;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter ur name: ");
        String name = input.nextLine();

        Charecter player = new Player(name, 100);
        player.displayAbsInfo();
        input.close();
    }
}
