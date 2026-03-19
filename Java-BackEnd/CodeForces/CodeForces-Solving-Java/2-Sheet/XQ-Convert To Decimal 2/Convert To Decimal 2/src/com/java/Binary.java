package com.java;

public class Binary {

    long n;

    public long getN() {
        return n;
    }

    public void setN(long n) {
        this.n = n;
    }

    public int countBinary() {
        int count = 0;
        long temp = n;

        while (temp > 0) {
            temp = temp & (temp - 1);
            count++;
        }

        return count;
    }

    public long getResult(int One) {
        long result = 0;

        for (int i = 0; i < One; i++) {
            result = result * 2 + 1;
        }

        return result;
    }
}