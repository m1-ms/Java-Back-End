package com.java;

public class Compare {

    private int A;
    private int B;

    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    public void setA(int a) {
        this.A = a;
    }

    public void setB(int b) {
        this.B = b;
    }

    public String CompareNem(){
            if (A>=B){
                return "Yes";
        }
            else {
                return "No";
            }
    }
}
