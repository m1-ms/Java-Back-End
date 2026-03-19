package com.java;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Enter Num
        System.out.print(" Enter Num : ");
        int num;
        num = scanner.nextInt();

        Fibonacci fibonacci =  new Fibonacci();

        fibonacci.setN(num);
        fibonacci.printFibonacci();
    }
}