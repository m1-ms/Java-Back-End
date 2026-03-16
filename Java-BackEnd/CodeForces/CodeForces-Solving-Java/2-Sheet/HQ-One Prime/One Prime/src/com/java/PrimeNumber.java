package com.java;

public class PrimeNumber {

    private int number;

    public PrimeNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}