package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" > Enter Age Person : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print(" > Enter Name Person : ");
        String name = scanner.nextLine();

        Person person = new Person();
        person.setAge(age);
        person.setName(name);

        person.printPersonInfo();

        System.out.print(" > Enter Edit negative Age : ");
        int negativeAge = scanner.nextInt();

        person.setAge(negativeAge);

        System.out.println(" - After invalid update:");
        System.out.println("Age : " + person.getAge());
    }
}