package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        // ID
        int id;
        System.out.print("Enter ID Student : ");
        id = scanner.nextInt();

        // NAME
        String name;
        System.out.print("Enter Name Student : ");
        name = scanner.next();

        // AGE
        int age;
        System.out.print("Enter Age Student : ");
        age = scanner.nextInt();

        // System.out.println(id + " " + name + " " + age);

        Student s1 = new Student();
        s1.setId(id);
        s1.setName(name);
        s1.setAge(age);

        s1.printInfo();

    }
}