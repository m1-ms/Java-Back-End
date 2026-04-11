package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Outer try block started");

            System.out.print("Enter first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            try {
                System.out.println(" - Started ");
                int result = a/b;
                System.out.println(" > Result = " + result);
            }
            catch (ArithmeticException exception){
                System.out.println(" - Started: Cannot divide by zero");
                throw exception;
            }

            System.out.println(" - Try continues.");

        }
        catch (ArithmeticException exception2) {
            System.out.println("> Handled in outer block");
        }
    }
}