package com.java;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        N = scanner.nextInt();
        numberPrint print1 = new numberPrint();
        print1.setN(N);
        print1.printNumbers();
    }
}