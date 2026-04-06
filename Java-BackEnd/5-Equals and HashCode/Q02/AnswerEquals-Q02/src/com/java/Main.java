package com.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

// Before override → Size = 10
// After override (id) → duplicates by id removed
// After override (name) → duplicates by name removed
// After override (id + name) → exact duplicates removed

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashSet<Person> set = new HashSet<>();

        for (int i = 1; i <= 10; i++) {

            System.out.print("Enter ID (" + i + "): ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Name (" + i + "): ");
            String name = scanner.nextLine();

            Person p = new Person();
            p.setId(id);
            p.setName(name);

            set.add(p);
        }

        // Print Info
        System.out.println(" -- Persons Info -- ");
        // Array List
        ArrayList<Person> person = new ArrayList<>(set);

        for (int i = 0; i < person.size(); i++) {
            System.out.println("Person (" + (i + 1) + ") : " + person.get(i));
        }
        System.out.println(" ");
        // HashSet Size
        System.out.println(" HashSet Size : " + set.size());

        // ------------------------------------------------------------


    }
}