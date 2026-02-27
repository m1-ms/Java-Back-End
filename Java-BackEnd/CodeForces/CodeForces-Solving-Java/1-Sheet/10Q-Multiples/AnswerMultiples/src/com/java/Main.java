package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A;
        A = scanner.nextInt();
        int B;
        B = scanner.nextInt();

        Multiples m1 = new Multiples();

        m1.setA(A);
        m1.setB(B);

        System.out.println(m1.MultiplesNum());
    }
}