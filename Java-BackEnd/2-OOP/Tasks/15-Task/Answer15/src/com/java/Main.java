package com.java;

import java.util.Scanner;

public class Main {
    static void main() {
        // student > name (first / second)- age - phone number
        // course > name course - id

        Scanner scanner = new Scanner(System.in);
        // STUDENT
        System.out.println(" -- Enter Data Info Student -- ");
        System.out.println(" ");
        // NAME
        System.out.print(" Enter First Name of Student : ");
        String firstNameStudent;
        firstNameStudent = scanner.nextLine();
        System.out.print(" Enter Second Name Of Student : ");
        String secondNameStudent;
        secondNameStudent = scanner.nextLine();

        // AGE
        System.out.print(" Enter Age Of Student : ");
        int age;
        age = scanner.nextInt();
        scanner.nextLine();

        // PHONE NUMBER
        System.out.print(" Enter Phone Number Of Student [Must Start +] : ");
        String phoneNumberStudent;
        phoneNumberStudent = scanner.nextLine();

        System.out.println(" ");

        // COURSE
        System.out.println(" -- Enter Data Info Course -- ");
        System.out.println(" ");
        // NAME
        System.out.print(" Enter Name Of Course : ");
        String nameCourse;
        nameCourse = scanner.nextLine();

        // ID
        System.out.print(" Enter ID Of Course : ");
        int idCourse;
        idCourse = scanner.nextInt();
        scanner.nextLine();

        // PRINT
        Student student = new Student();
        student.setFirstNameStudent(firstNameStudent);
        student.setSecondNameStudent(secondNameStudent);
        student.setAgeStudent(age);
        student.setPhoneNumberStudent(phoneNumberStudent);

        Course course = new Course();
        course.setNameCourse(nameCourse);
        course.setId(idCourse);

        Print print = new Print();
        print.printStudent(student);
        print.printCourse(course);

    }
}