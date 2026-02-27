package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A;
        A = scanner.nextInt();
        int B;
        B = scanner.nextInt();

        Compare C1 = new Compare();

        C1.setA(A);
        C1.setB(B);

        System.out.println(C1.CompareNem());
    }
}