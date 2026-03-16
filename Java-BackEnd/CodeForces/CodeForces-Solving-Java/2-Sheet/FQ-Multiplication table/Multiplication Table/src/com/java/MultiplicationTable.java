package com.java;

public class MultiplicationTable {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MultiplicationTable() {
        this.number = number;
    }

    public void printTable() {
        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
