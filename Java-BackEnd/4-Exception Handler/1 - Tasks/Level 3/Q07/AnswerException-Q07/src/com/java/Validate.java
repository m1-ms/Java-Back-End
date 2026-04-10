package com.java;

public class Validate {

    public static void validateAge(int age) throws InvalidAgeException {

        if (age<18){
            throw new InvalidAgeException( " - Age must 18 or Older. ");
        }

        System.out.println(" - Valid Age.");

    }

}
