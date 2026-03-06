package com.java;

public class Pyramid {
    private int Num;

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        Num = num;
    }
    public void printPyramid(){
        for(int i = 1; i <= Num; i++){
            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
