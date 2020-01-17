package com.restaurant;

import java.time.LocalDateTime;

public class MenuItem {
    private final int menuId;
    private double price;
    private String description;
    private String category;
    private LocalDateTime dateAdded;
    private boolean isNew;

       public MenuItem(int menuId, double price, String description, String category, boolean isNew) {
           this.menuId = menuId;
           this.price = price;
           this.description = description;
           this.category = category;
           this.isNew = isNew;
           this.dateAdded = LocalDateTime.now();
       }

    public int getMenuId() {
        return menuId;
       }

    public double getPrice() {
        return price;
       }

    public String getDescription() {
        return description;
       }

    public String getCategory() { return category; }

    public LocalDateTime getDate() {
        return dateAdded;
       }

    public boolean getIsNew() { return isNew; }

    @Override
    public String toString() {
        return menuId + " " + description + " " + price + " " + category + " "
                + "This item is new: " + isNew;
    }
}
