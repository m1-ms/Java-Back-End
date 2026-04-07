package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // i use while to use loop if user input invalid number

        while (true){
            try {
                System.out.print(" - Enter Number : ");
                String numString;
                numString = scanner.nextLine();
                int num;
                num = Integer.parseInt(numString);

                System.out.println(" > The Number is = " + num);
            }
            catch (NumberFormatException numberFormatException){
                System.out.println(" - Invalid Number [Please enter a valid number.] ");
            }
        }
    }
}