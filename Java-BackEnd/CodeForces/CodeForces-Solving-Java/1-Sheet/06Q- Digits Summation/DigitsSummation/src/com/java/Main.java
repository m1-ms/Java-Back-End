package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long m;
        m = scanner.nextLong();

        long n;
        n = scanner.nextLong();

        DigitsSumm S1 = new DigitsSumm();

        S1.setM(m);
        S1.setN(n);

        S1.print();
    }
}