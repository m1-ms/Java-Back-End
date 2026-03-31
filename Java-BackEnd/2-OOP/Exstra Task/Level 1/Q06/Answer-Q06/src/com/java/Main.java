package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ArrayList
        List<Student> students = new ArrayList<>();

        System.out.println(" >>  Enter Student Data  << ");
        System.out.print(" - Enter Number of Students : ");
        int numbers;
        numbers = scanner.nextInt();
//        scanner.nextInt();

        for (int i = 0; i < numbers; i++) {

            System.out.println("Student " + (i + 1));

            System.out.print(" - Enter ID : ");
            int id;
            id = scanner.nextInt();
            scanner.nextLine();

            System.out.print(" - Enter Name : ");
            String name;
            name = scanner.nextLine();

            System.out.print(" - Enter Grade : ");
            double grade;
            grade = scanner.nextDouble();

            Student student = new Student();
            student.setId(id);
            student.setName(name);
            student.setGrade(grade);

            students.add(student);
        }

        System.out.println(" >>  Students Data : ");
        for (Student student : students) {
            student.printStudentInfo();
        }
    }
}