package com.java;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        passwordCheck check = new passwordCheck();

        while(true) {
            int num = scanner.nextInt();
            check.setNum(num);
            if (check.Correct()) {
                break;
            }
        }
    }
}