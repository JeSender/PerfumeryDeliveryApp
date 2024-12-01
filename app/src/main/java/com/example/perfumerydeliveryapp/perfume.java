package com.example.perfumerydeliveryapp;

public class perfume {

    private String name;
    private String description;
    private double price;

    // Constructor to initialize the fields
    public perfume(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for description
    public String getDescription() {
        return description;
    }

    // Getter method for price
    public double getPrice() {
        return price;
    }
}
