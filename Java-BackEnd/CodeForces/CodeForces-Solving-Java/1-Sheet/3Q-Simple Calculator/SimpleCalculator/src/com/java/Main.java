package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x;
        x = scanner.nextDouble();

        double y;
        y = scanner.nextDouble();

        SimpleCalculator C1 = new SimpleCalculator();

        C1.setX(x);
        C1.setY(y);

        C1.printres();
    }
}