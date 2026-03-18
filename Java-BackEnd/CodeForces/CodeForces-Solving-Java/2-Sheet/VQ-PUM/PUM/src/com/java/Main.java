package com.java;

import java.util.Scanner;

public class Main {
     static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         System.out.println("Enter N : ");
        int n;
         n = scanner.nextInt();

        LogPum logPum = new LogPum();
         logPum.setN(n);

         logPum.printLogPum();
    }
}