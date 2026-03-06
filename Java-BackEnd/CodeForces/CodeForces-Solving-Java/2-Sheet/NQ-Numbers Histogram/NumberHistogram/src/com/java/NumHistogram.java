package com.java;

public class NumHistogram {

    private int[] nums;
    private char symbol;

    public int[] getNums() {
        return nums;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void printNumHistogram() {

        for (int i = 0; i < nums.length; i++) {

            for (int x = 0; x < nums[i]; x++) {
                System.out.print(symbol);
            }

            System.out.println();
        }
    }
}