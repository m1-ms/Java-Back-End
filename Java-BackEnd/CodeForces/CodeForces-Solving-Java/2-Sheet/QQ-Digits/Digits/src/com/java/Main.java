package com.java;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tnum;
        tnum = scanner.nextInt();

        while (tnum-- > 0) {
            int nte;
            nte = scanner.nextInt();

            Digits digits = new Digits();
            digits.setNum(nte);

            digits.printDigits();
        }
    }
}