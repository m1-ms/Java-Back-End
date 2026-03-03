package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A;
        A = scanner.nextInt();
        int B;
        B = scanner.nextInt();
        int C;
        C = scanner.nextInt();

        maxMin num = new maxMin();

        num.setA(A);
        num.setB(B);
        num.setC(C);

        num.printNum();
    }
}