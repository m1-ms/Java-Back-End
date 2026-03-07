package com.java;

public class Shape {
    private int Num;

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        Num = num;
    }
    public void printShape(){

        // Tooop
        for (int i = 1; i <= Num; i++) {

            for (int x = 1; x <= Num - i; x++) {
                System.out.print(" ");
            }

            for (int x = 1; x <= (2 * i - 1); x++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom
        for (int i = Num; i >= 1; i--) {

            for (int x = 1; x <= Num - i; x++) {
                System.out.print(" ");
            }

            for (int x = 1; x <= (2 * i - 1); x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
