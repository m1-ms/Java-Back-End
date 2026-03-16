package com.java;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter N : ");
        int N;
        N = scanner.nextInt();

        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.setNumber(N);
        multiplicationTable.printTable();
    }
}