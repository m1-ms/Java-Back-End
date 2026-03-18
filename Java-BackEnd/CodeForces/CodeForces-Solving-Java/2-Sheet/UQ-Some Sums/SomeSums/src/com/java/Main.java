package com.java;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N : ");
        int N;
        N = scanner.nextInt();
        System.out.println("Enter A : ");
        int A;
        A = scanner.nextInt();
        System.out.println("Enter B : ");
        int B;
        B = scanner.nextInt();

        SomeSums someSums = new SomeSums();

        someSums.setN(N);
        someSums.setA(A);
        someSums.setB(B);

        System.out.println(someSums.calcSum());
    }
}