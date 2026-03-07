package com.java;

public class Sequence {
    private int N;
    private int M;

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public int getM() {
        return M;
    }

    public void setM(int m) {
        M = m;
    }
    public void printSequence(){
        int S;
        S = Math.min(N, M);
        int E;
        E = Math.max(N, M);

        int sum = 0;

        for (int i = S; i <= E; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
