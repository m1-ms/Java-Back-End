package com.java;

public class Motor extends Parent {

    boolean sideCar;

    public Motor(String brand, int speed, boolean hasSideCar) {
        super(brand, speed);
        this.sideCar = hasSideCar;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Has SideCar: " + sideCar);
    }

}