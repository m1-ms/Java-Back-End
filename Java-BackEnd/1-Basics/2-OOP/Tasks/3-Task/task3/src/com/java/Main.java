package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sum number Even.");
        System.out.println("--------------------------");

        System.out.println("Enter First Number :");
        long num1;
        num1 = scanner.nextLong();

        System.out.println("Enter Second Number : ");
        long num2;
        num2 = scanner.nextLong();

        System.out.println("Enter Third Number : ");
        long num3;
        num3 = scanner.nextLong();

        SumEven sum = new SumEven();

        sum.setNum1(num1);
        sum.setNum2(num2);
        sum.setNum3(num3);

        sum.PrintSum();

    }
}