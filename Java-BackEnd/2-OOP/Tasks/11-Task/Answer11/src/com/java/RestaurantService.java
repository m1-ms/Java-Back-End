package com.java;

public class RestaurantService extends Restaurant{

    @Override
    public void showOrder() {
        System.out.println("Orders List : ");

        for (String order : orders){
            System.out.println(" - " + order);
        }
    }
}
