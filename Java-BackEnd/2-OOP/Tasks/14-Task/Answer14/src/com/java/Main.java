package com.java;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        // Student           [ Name first and second - Age ]
        // Email             [ Mail ]
        Scanner scanner = new Scanner(System.in);
        System.out.println(" -- Enter Data Of Student -- ");
        // NAME
        System.out.print("Enter First Name Of Student : ");
        String firstName;
        firstName = scanner.nextLine();
        System.out.print("Enter Second Name Of Student : ");
        String secondName;
        secondName = scanner.nextLine();
        // AGE
        System.out.print("Enter Age Of Student : ");
        int age;
        age = scanner.nextInt();
        scanner.nextLine();
        // EMAIL
        System.out.print("Enter E-Mail Of Student (studentemail@gmail.com): ");
        String email;
        email = scanner.nextLine();

        Student student = new Student();
        student.setFirstName(firstName);
        student.setSecondName(secondName);
        student.setAge(age);
        student.printStudentData();

        Email mail = new Email();
        mail.setMail(email);
        mail.printEmailData();

    }
}