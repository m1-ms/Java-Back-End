package com.java;

import java.util.List;

public class LogicNumber {

    private int even;
    private int odd;
    private int positive;
    private int negative;

    public void logic(List<Number> numbers){

        for (Number n : numbers){

            int number = n.getNumber();

            // even
            if (number % 2 == 0){
                even++;
            }
            else {
                odd++;
            }

            // positive
            if (number > 0){
                positive++;
            }
            else if (number < 0){
                negative++;
            }

        }
    }

    public void printResult(){

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);

    }
}