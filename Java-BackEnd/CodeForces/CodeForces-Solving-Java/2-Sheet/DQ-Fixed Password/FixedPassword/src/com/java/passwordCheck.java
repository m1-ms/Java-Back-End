package com.java;

public class passwordCheck {

    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;

        if (num == 1999) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }

    public boolean Correct() {
        return this.num == 1999;
    }
}