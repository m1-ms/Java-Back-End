package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" Enter N : ");
        int n = input.nextInt();

        PrimeNum primeNum = new PrimeNum();

        for (int i = 2; i <= n; i++) {

            if (primeNum.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}