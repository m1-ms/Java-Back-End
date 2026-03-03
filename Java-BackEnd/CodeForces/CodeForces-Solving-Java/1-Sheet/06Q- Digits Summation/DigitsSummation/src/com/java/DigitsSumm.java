package com.java;

public class DigitsSumm {

    private long m;
    private long n;

    public long getM(){
        return m;
    }

    void setM(long m) {
        this.m = m;
    }

    public long getN() {
        return n;
    }

    public void setN(long n) {
        this.n = n;
    }

    public void print (){
        long MS = m % 10;
        long NS = n % 10;

        // res
        System.out.println(MS + NS);
    }
}