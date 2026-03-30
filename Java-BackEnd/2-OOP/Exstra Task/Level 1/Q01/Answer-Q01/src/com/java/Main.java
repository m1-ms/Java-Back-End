package com.java;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        // Name String
        // Age Int

        Scanner scanner = new Scanner(System.in);

        System.out.println("> -- Enter Data Person Info -- <");
        System.out.println(" ");
        System.out.print(" > Enter Name (ENG) : ");
        String name;
        name = scanner.nextLine();

        System.out.print(" > Enter Age : ");
        int age;
        age = scanner.nextInt();

        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        
        person.printDataPerson();
    }
}