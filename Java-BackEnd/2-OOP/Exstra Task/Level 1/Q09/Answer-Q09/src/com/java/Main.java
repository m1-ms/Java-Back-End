package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" >> Enter Student Info : )");

        System.out.print(" Enter Id : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print(" Enter Name : ");
        String name = scanner.nextLine();

        System.out.print(" Enter Grade : ");
        double grade = scanner.nextDouble();

        Student student = new Student(id, name, grade);

        student.printStudentInfo();
    }
}