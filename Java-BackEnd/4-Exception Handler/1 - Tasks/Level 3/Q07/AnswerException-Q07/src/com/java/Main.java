package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print(" Enter your Age : ");
            int age;
            age = scanner.nextInt();
            Validate.validateAge(age);
        }
        catch (InvalidAgeException e) {
            System.out.println( e.getMessage() );
        }

    }
}