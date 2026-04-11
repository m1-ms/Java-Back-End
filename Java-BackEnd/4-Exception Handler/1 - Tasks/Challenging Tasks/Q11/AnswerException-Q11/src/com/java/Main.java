package com.java;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(" - Inside try Block ");
            int result = 10/0;
            System.out.println(" - This will not Print ");
        }
        catch (ArithmeticException exception) {
            System.out.println(" - Exception : " + exception.getMessage());
        }
        finally {
            System.out.println(" - Finally block always Executes.");
        }

    }
}