package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intx;
        intx = scanner.nextInt();

        long longx;
        longx = scanner.nextLong();

        char charx;
        charx = scanner.next().charAt(0);

        float floatx;
        floatx = scanner.nextFloat();

        double doublex;
        doublex = scanner.nextDouble();

        BasicDataTypes B1 = new BasicDataTypes();

        B1.setIntx(intx);
        B1.setLongx(longx);
        B1.setCharx(charx);
        B1.setFloatx(floatx);
        B1.setDoublex(doublex);

        B1.print();
    }
}