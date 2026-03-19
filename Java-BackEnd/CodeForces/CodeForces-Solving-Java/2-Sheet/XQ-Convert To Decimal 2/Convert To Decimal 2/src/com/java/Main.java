package com.java;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Num T : ");
        int T;
        T = scanner.nextInt();

        Binary binary = new Binary();

        while (T-- > 0) {
            System.out.println("Enter Num N : ");
            long N;
            N = scanner.nextLong();

            binary.setN(N);

            int ones = binary.countBinary();
            long result = binary.getResult(ones);

            System.out.println(result);
        }
    }

}