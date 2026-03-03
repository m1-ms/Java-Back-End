package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        number = scanner.nextInt();

        int[] arr = new int[number];

        for (int i = 0; i < number; i++) {
            arr[i] = scanner.nextInt();
        }

        findMax maxfind = new findMax();

        maxfind.setNums(arr);

        System.out.println(maxfind.foundMax());
    }
}