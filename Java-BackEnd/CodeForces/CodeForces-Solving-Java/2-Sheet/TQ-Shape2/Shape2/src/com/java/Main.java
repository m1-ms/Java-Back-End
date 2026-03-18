package com.java;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N : ");
        int N;
        N = scanner.nextInt();

        Shape shape = new Shape();

        shape.setN(N);
        shape.printShape();
    }
}