package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ID : ");
        long id;
        id = scanner.nextLong();

        System.out.print("Enter Name : ");
        String name;
        name = scanner.next();

        System.out.print("Enter Age : ");
        float age;
        age = scanner.nextFloat();

        System.out.print("Enter PhoneNumber : ");
        String phoneNumber;
        phoneNumber = scanner.next();

        System.out.print("Enter Salary : ");
        float salary;
        salary = scanner.nextFloat();

        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setPhoneNumber(phoneNumber);
        teacher.setSalary(salary);
        teacher.PrintInfoTeacher();
    }
}