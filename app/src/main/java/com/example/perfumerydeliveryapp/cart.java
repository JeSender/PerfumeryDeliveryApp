package com.example.perfumerydeliveryapp;



import java.util.ArrayList;
import java.util.List;

public class cart {
    private static final List<perfume> cartItems = new ArrayList<>();

    // Add perfume to the cart
    public static void addToCart(perfume perfume) {
        cartItems.add(perfume);
    }

    // Get the items in the cart
    public static List<perfume> getCartItems() {
        return cartItems;
    }

    // Get total price of items in the cart
    public static double getTotalPrice() {
        double total = 0;
        for (perfume perfume : cartItems) {
            total += perfume.getPrice();
        }
        return total;
    }

}

