package com.java;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int N;
            N = scanner.nextInt();
            int M;
            M = scanner.nextInt();

            if (N <= 0 || M <= 0) {
                break;
            }

            Sequence sequence = new Sequence();

            sequence.setN(N);
            sequence.setM(M);

            sequence.printSequence();

        }
    }
}