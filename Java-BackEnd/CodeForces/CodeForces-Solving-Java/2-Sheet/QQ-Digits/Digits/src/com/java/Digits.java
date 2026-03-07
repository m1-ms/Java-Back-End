package com.java;

public class Digits {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public void printDigits(){
        if (num == 0){
            System.out.println(0);
            return;
        }
        while (num > 0){
            int digit = num % 10;
            System.out.print(digit + " ");
            num = num / 10;
        }
        System.out.println(" ");
    }
}
