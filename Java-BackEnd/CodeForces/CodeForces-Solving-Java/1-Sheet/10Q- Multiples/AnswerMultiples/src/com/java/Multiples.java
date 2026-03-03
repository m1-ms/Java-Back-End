package com.java;

public class Multiples {

    private int A;
    private int B;

    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    public void setA(int a) {
        A = a;
    }

    public void setB(int b) {
        B = b;
    }

    public String MultiplesNum(){
        if (A % B == 0 || B % A == 0) {
            return "Multiples";
        } else {
            return "No Multiples";
        }
    }
}