package com.java;

public class Truck extends Parent{

    int truck;

    public Truck(String brand, int speed, int truck) {
        super(brand, speed);
        this.truck = truck;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Load Capacity: " + truck + " tons");
    }

}