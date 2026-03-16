package com.java;

public class Shape {
    private int N;

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }
    public void printShape() {

        for (int i = N; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
