package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Shape shape = new Shape();
        shape.setN(n);
        shape.printShape();

    }
}