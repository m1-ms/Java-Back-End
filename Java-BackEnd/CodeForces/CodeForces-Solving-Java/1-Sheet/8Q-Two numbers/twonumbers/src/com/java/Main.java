package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A;
        A = scanner.nextInt();

        double B;
        B = scanner.nextInt();

        Calculator cc = new Calculator();

        cc.setA(A);
        cc.setB(B);
        cc.printCalcuRes();
    }
}