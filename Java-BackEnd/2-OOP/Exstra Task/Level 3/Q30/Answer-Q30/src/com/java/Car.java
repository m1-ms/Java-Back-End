package com.java;

public class Car extends Parent {

    int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(" - Doors: " + doors);
    }

}