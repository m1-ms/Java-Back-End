package com.java;

import pack1.MainStudent;
import pack2.MainTeacher;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" >> Application Menu << ");
        System.out.println("1 - Student");
        System.out.println("2 - Teacher");

        System.out.print(" Choose option : ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                MainStudent.runStudent();
                break;

            case 2:
                MainTeacher.runTeacher();
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}