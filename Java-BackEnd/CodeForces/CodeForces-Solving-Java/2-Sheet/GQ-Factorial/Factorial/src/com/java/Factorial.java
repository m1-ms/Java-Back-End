package com.java;

public class Factorial {
    private int number;

    public Factorial(int num) {
        this.number = num;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public long calculateFactorial(){
        if (number >= 0) {
            long result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return result;
        }
        else {
            System.out.println("Invalid Number < Must be Big than 0 >");
        }
        return 0;
    }
}
