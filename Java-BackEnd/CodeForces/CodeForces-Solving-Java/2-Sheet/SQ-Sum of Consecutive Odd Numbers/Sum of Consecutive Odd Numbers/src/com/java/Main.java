package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Num X: ");
        int x;
        x = scanner.nextInt();

        System.out.print("Enter Num Y: ");
        int y;
        y = scanner.nextInt();
        SumNum sumNum = new SumNum();

        sumNum.setX(x);
        sumNum.setY(y);

        System.out.println(sumNum.calcSumNum());
    }
}