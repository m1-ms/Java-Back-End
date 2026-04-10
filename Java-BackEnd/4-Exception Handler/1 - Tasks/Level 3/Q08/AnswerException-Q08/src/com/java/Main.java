package com.java;

import static com.java.ExceptionPropagate.method1;

public class Main {
    public static void main(String[] args) {

        System.out.println(" > Program started < ");

        try {
            method1();
        }
        catch (ArithmeticException exception){
            System.out.println(" - Exception : " + exception.getMessage());
        }

        System.out.println(" - Program Continue.");

    }
}