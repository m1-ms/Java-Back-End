package com.java;

public class Parent {
    String brand;
    int speed;

    public Parent(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void showInfo() {
        System.out.println(" - Brand: " + brand);
        System.out.println(" - Speed: " + speed);
    }
}