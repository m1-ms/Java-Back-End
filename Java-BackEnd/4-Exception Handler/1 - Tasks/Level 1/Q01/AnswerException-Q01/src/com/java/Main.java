package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print(" - Enter First Number : ");
            int num1;
            num1 = scanner.nextInt();
            System.out.print(" - Enter Second Number : ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println(" > Result = " + result);
        }

        catch (ArithmeticException arithmeticException) {
            System.out.println(" > Can't divide by Zero < ");
        }

        catch (Exception exception) {
            System.out.println(" - Invalid Input ");
        }

        finally {
            scanner.close();
        }

    }
}