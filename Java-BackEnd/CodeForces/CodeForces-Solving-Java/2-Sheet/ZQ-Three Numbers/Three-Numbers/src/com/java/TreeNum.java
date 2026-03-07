package com.java;

public class TreeNum {
    private int K;
    private int S;

    public int getK() {
        return K;
    }

    public void setK(int k) {
        K = k;
    }

    public int getS () {
        return S;
    }

    public void setS(int s) {
        S = s;
    }

    public long countTreeNum() {

        long count = 0;

        for (int x = 0; x <= K; x++) {
            for (int y = 0; y <= K; y++) {
                int Z;
                Z = S - x - y;
                if (Z >= 0 && Z <= K) {
                    count++;
                }
            }
        }
        return count;
    }

    public void printCountTreeNum(){
        System.out.println(countTreeNum());
    }
}
