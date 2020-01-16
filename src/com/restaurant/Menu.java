package com.restaurant;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private ArrayList<MenuItem> menu;
    private LocalDateTime lastUpdated;

    //default constructor
    public Menu() {
        this.menu = new ArrayList<>();
        this.lastUpdated = LocalDateTime.now();
    }

    private void addToMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter item price.");
        Double price = input.nextDouble();
        System.out.println("Enter item description.");
        String description = input.nextLine();
        System.out.println("Enter item category: appetizer, main course, or dessert.");
//        MenuCategory category = input.next();
        lastUpdated = LocalDateTime.now();


//        menu.add(new MenuItem(double price, String description, MenuCategory category, boolean isNew);

    }

    private void removeFromMenu(int menuItemId){
        for(MenuItem item : menu){
           if (item.getMenuId() == menuItemId) {
               menu.remove(item);
               lastUpdated = LocalDateTime.now();
            }
        }
    }

    public ArrayList<MenuItem> getMenu(){
        return menu;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }



}
