package com.java;

public class Shape {

    private int N;

    public int getN() {
        return N;
    }

    public void setN(int n) {
        if (n >= 1 && n <= 99) {
            N = n;
        } else {
            System.out.println("Invalid");
        }
    }

    public void printShape() {

        for (int x = 1; x <= N; x++) {

            // space
            for (int i = 1; i <= N - x; i++) {
                System.out.print(" ");
            }

            for (int z = 1; z <= (2 * x - 1); z++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}