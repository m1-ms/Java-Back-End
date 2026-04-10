package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = { 10,20,30,40,50 };
        Scanner scanner = new Scanner(System.in);
        System.out.print(" - Enter between [ 0 : 4 ] : ");
        int num;
        num = scanner.nextInt();

        try {
            System.out.println(" - Value = " + arr[num]);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println(" - Invalid Number!");
            System.out.println(" - Please Enter Right Number.");
        }

    }
}