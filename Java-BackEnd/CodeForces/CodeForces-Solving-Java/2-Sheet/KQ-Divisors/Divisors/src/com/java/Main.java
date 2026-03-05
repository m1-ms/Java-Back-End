package com.java;

import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Num;
        Num = scanner.nextInt();

        Divisors divisors = new Divisors(Num);
        List<Integer> allDivisors = divisors.findDivis();

        for (int d : allDivisors) {
            System.out.println(d);
        }
    }
}
