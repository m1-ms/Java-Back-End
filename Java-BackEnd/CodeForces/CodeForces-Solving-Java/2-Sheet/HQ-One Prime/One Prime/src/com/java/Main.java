package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int Num = scanner.nextInt();

        PrimeNumber primeNumber = new PrimeNumber(Num);

        if (primeNumber.isPrime()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}