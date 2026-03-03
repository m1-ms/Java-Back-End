package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n;
        n = scanner.nextLong();

        Summation S1 = new Summation();

        S1.setN(n);
        S1.Print();
    }
}