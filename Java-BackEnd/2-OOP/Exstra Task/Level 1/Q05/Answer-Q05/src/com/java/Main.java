package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("  --  Welcome Student Data  --");
        System.out.print(" * Enter ID : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print(" * Enter Name : ");
        String name = scanner.nextLine();

        System.out.print(" * Enter Age : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print(" * Enter Phone Number : ");
        String phoneNumber = scanner.nextLine();

        System.out.print(" * Enter E-Mail : ");
        String email = scanner.nextLine();

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setPhoneNumber(phoneNumber);
        student.setEmail(email);

        student.printStudentData();
    }
}