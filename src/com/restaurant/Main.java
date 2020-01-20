package com.restaurant;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        System.out.println("This is your restaurant!");

        Menu menu = new Menu();

        menu.addToMenu();

        menu.addToMenu();

        menu.printMenu(menu);

        menu.removeFromMenu(1);

        menu.printMenu(menu);

    }
}
