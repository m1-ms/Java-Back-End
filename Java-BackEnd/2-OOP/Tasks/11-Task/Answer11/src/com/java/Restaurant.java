package com.java;

import java.util.ArrayList;

public abstract class Restaurant {

    protected static ArrayList<String> orders = new ArrayList<>();

    public static void addOrder(String menu) {
        orders.add(menu);
        System.out.println("Order Add : " + menu);
    }

    public abstract void showOrder();
}