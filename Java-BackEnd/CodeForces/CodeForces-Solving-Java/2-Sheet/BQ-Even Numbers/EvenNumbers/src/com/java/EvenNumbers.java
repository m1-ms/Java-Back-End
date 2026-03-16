package com.java;

public class EvenNumbers {
    // print even number from 1 to N .
    // if you don't any even number print -1 (N<2)

    private long N;

    public long getN() {
        return N;
    }

    public void setN(long n) {
        N = n;
    }

    public void printEvenNumbers() {

        if (N < 2) {
            System.out.println(-1);
            return;
        }

        for (long i = 2; i <= N; i += 2) {
            System.out.println(i);
        }
    }
}
