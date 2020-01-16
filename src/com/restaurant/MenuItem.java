package com.restaurant;

import java.util.Date;

public class MenuItem {
    private final int menuId;
    private double price;
    private String description;
    private String category;
    private Date dateAdded;
    private boolean isNew;

       public MenuItem(int menuId, double price, String description, String category, boolean isNew) {
           this.menuId = menuId;
           this.price = price;
           this.description = description;
           this.category = category;
           this.isNew = isNew;

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

    public Date getDate() {
        return dateAdded;
       }
}
