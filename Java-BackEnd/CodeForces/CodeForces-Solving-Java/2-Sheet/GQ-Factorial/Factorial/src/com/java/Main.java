package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int Tnum;
        Tnum = scanner.nextInt();

        for (int i = 0; i < Tnum; i++) {

            int num;
            num = scanner.nextInt();

            Factorial factorial = new Factorial(num);

            System.out.println(factorial.calculateFactorial());
        }
    }
}