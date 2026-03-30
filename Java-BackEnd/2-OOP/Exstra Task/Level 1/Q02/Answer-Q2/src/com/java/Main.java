

package com.java;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("  --  Enter Person Data  -- ");

        System.out.print(" * Enter Person Name : ");
        String name = scanner.nextLine();

        System.out.print(" * Enter Person Age : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print(" * Enter Person PhoneNumber : ");
        String phoneNumber = scanner.nextLine();

        System.out.print(" * Enter Person E-Mail : ");
        String email = scanner.nextLine();

        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setPhoneNumber(phoneNumber);
        person.setEmail(email);

        person.printPersonInfo();
    }
}