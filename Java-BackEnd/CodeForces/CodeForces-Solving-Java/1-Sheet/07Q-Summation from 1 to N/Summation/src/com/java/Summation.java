package com.java;

public class Summation {

    private long n;

    public long getN() {
        return n;
    }

    public void setN(long n) {
        this.n = n;
    }

    void Print (){
        // result = n * (n + 1) / 2;
        System.out.println((n*(n+1)/2));
    }
}
