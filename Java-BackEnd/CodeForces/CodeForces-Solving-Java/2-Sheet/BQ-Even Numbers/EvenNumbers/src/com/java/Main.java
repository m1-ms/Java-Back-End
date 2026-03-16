package com.java;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter N : ");
        long N;
        N = scanner.nextLong();

        EvenNumbers evenNumbers = new EvenNumbers();
        evenNumbers.setN(N);
        evenNumbers.printEvenNumbers();

    }
}