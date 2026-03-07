package com.java;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int Num;
        Num = scanner.nextInt();

        Shape shape3 = new Shape();
        shape3.setNum(Num);
        shape3.printShape();
    }
}