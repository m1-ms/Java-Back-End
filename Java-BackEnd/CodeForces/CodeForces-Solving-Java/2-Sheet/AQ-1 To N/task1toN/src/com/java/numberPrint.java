package com.java;

public class numberPrint {
    private int N;

    public int getN() {
        return N;
    }

    public void setN(int n) {
        this.N = n;
    }
    public void printNumbers() {
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }
}
