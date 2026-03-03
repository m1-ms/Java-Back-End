package com.java;

public class maxMin {
    private int A;
    private int B;
    private int C;

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    public int getC() {
        return C;
    }

    public void setC(int c) {
        C = c;
    }
    public int getMax(){
        int max = A;
        if (max < B){
            max = B;
        }
        if (max < C){
            max = C;
        }
        return max;
    }
    public int getMin(){
        int min = A;
        if (min > B){
            min = B;
        }
        if (min > C){
            min = C;
        }
        return min;
    }
    public void printNum(){
        System.out.println(getMax() + " " + getMin());
    }
}
