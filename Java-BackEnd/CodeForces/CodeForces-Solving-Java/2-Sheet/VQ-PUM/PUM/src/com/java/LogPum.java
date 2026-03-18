package com.java;

public class LogPum {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if (n>=1 && n<=20){
            this.n = n;
        }
        else {
            System.out.println("Invalid.");
        }
    }
    public void printLogPum() {
        int num = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(num + " " + (num + 1) + " " + (num + 2) + " PUM");
            num += 4;
        }
    }
}
