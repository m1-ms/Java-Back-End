package com.java;

public class GCD {
    private int p;
    private int q;

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }
    public int calcGCD(){
        while (q != 0){
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }
}
