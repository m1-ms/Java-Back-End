package com.java;

import com.java.Parent;

public class Main {
    public static void main(String[] args) {

        Parent v1 = new Car("Toyota", 180, 4);
        Parent v2 = new Motor("Yamaha", 220, false);
        Parent v3 = new Truck("Volvo", 120, 10);

        System.out.println("=== CAR ===");
        v1.showInfo();

        System.out.println("=== MOTOR ===");
        v2.showInfo();

        System.out.println("=== TRUCK ===");
        v3.showInfo();
    }
}