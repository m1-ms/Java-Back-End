package com.java;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ID - Name
        Scanner scanner = new Scanner(System.in);
        System.out.print(" - Enter ID Please (1) : ");
        int id1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print(" - Enter Name Please (1) : ");
        String name1 = scanner.nextLine();
        System.out.println(" ");

        System.out.print(" - Enter ID Please (2) : ");
        int id2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print(" - Enter Name Please (2) : ");
        String name2 = scanner.nextLine();
        System.out.println(" ");

        System.out.print(" - Enter ID Please (3) : ");
        int id3 = scanner.nextInt();
        scanner.nextLine();
        System.out.print(" - Enter Name Please (3) : ");
        String name3 = scanner.nextLine();
        System.out.println(" ");

        Person person1 = new Person(id1 , name1);
        person1.setId(id1);
        person1.setName(name1);

        Person person2 = new Person(id2 , name2);
        person2.setId(id2);
        person2.setName(name2);

        Person person3 = new Person(id3 , name3);
        person3.setId(id3);
        person3.setName(name3);

        System.out.println(" -- Persons Info -- ");
        System.out.println("Person (1) : " + person1);
        System.out.println("Person (2) : " + person2);
        System.out.println("Person (3) : " + person3);
        System.out.println(" ");

        // Equals
        System.out.println(" -- Equals -- ");
        System.out.println(" Person (1) Equals Person (2) : " + person1.equals(person2));
        System.out.println(" Person (1) Equals Person (3) : " + person1.equals(person3));
        System.out.println(" Person (2) Equals Person (3) : " + person2.equals(person3));
        System.out.println(" ");

        // Comper
        System.out.println(" -- Comper -- ");
        System.out.println(" Person (1) == Person (2) : " + (person1 == person2) );
        System.out.println(" Person (1) == Person (3) : " + (person1 == person3) );
        System.out.println(" Person (2) == Person (3) : " + (person2 == person3) );
        System.out.println(" ");

        // HashCodes
        System.out.println(" -- HashCodes --");
        System.out.println("Person (1) HashCode : " + person1.hashCode());
        System.out.println("Person (2) HashCode : " + person2.hashCode());
        System.out.println("Person (3) HashCode : " + person3.hashCode());
        System.out.println(" ");

        // HashCode Test
        System.out.println(" -- HashSet Test --");
        HashSet <Person> set = new HashSet<>();
        set.add(person1);
        set.add(person2);
        set.add(person3);
        System.out.println(" HashSet Size : " + set.size());

    }
}