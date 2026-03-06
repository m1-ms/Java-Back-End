package com.java;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        num = scanner.nextInt();

        Pyramid pyramid = new Pyramid();
        pyramid.setNum(num);
        pyramid.printPyramid();
    }
}