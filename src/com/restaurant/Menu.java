package com.restaurant;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menu;
    private LocalDateTime lastUpdated;

    //default constructor
    public Menu() {
        this.menu = new ArrayList<>();
        this.lastUpdated = LocalDateTime.now();
    }

    private void addToMenu(MenuItem item){
        menu.add(item);
        lastUpdated = LocalDateTime.now();
    }
}
