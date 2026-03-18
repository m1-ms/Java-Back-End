package com.java;

public class SumNum {

    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int calcSumNum() {

        int sum = 0;

        int start = Math.min(x, y);
        int end = Math.max(x, y);

        for (int i = start + 1; i < end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        return sum;
    }
}