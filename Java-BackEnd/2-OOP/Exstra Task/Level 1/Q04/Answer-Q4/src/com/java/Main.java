package com.java;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        // id / name / grade

        Scanner scanner = new Scanner(System.in);
        System.out.println(" -- Welcome Enter Student Data -- ");
        System.out.print(" * Enter Student ID : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print(" * Enter Student Name : ");
        String name = scanner.nextLine();

        System.out.print(" * Enter Student Grade : ");
        double grade = scanner.nextDouble();

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setGrade(grade);

        student.printStudentData();
    }
}