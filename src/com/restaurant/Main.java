package com.restaurant;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        System.out.println("This is your restaurant!");

        Menu menu = new Menu();

        menu.addToMenu();

        for (MenuItem menuItems : menu.getMenu()) {
            System.out.println(menuItems.toString());
        }
    }
}
