package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r;
        r = scanner.nextDouble();

        areaCircle area = new areaCircle();

        area.setR(r);

        area.printArea();
    }
}