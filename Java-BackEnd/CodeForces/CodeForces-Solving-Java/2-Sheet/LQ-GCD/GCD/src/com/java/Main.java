package com.java;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter First Num : ");
        System.out.println();
        int p;
        p = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println(" Enter Second Num : ");
        int q;
        q = scanner.nextInt();

        GCD gcd = new GCD();
        gcd.setP(p);
        gcd.setQ(q);

        System.out.println(gcd.calcGCD());
    }
}