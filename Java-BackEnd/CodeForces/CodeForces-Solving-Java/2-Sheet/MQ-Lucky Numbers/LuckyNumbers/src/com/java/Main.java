package com.java;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A;
        A = scanner.nextInt();

        int B;
        B = scanner.nextInt();

        boolean found = false;

        for (int i = A; i <= B; i++) {
            if (LuckNum.Lucky(i)) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println(-1);
        }
    }
}