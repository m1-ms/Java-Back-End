package com.java;

public class Fibonacci {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if (n>=1 && n<=45){
            this.n = n;
        }
    }
    public void printFibonacci (){

        int a=0;
        int b=1;

        for (int i=1 ; i<=n ; i++){
            System.out.print( a+ " ");

            int next = a+b;
            a = b;
            b = next;
        }
    }
}
