package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Print print = new Print();

        while (true) {

            System.out.print(" - Enter ID : ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print(" - Enter Name : ");
            String name = scanner.nextLine();

            System.out.print(" - Enter Age : ");
            int age = scanner.nextInt();
            scanner.nextLine();

            Student student = new Student();
            student.setId(id);
            student.setName(name);
            student.setAge(age);

            System.out.println(" ");
            System.out.println(" - Student Created Successfully");
            System.out.println(" ");

            System.out.print(" >> Do you want to add another student? (yes/no): ");
            String choice = scanner.next();
            System.out.println(" ");

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }
        print.printTotal();
    }
}