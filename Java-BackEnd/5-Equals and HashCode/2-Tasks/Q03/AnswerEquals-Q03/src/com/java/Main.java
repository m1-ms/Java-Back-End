package com.java;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Person, String> map = new HashMap<>();

        Person person1 = new Person(1, "Ali");
        Person person2 = new Person(1, "Ahmed");

        map.put(person1, "Employee");
        map.put(person2, "Manager");

        System.out.println("After inserting two keys with SAME ID:");
        System.out.println(map);

        Person person3 = new Person(1, "Test");
        System.out.println("Retrieve using new object with same ID:");
        System.out.println("Value = " + map.get(person3));

        person1.setId(2);

        System.out.println("After modifying key:");

        Person person4 = new Person(1, "Ali");
        System.out.println("Retrieve with OLD ID:");
        System.out.println("Value = " + map.get(person4));

        Person person5 = new Person(2, "Ali");
        System.out.println("Retrieve with NEW ID:");
        System.out.println("Value = " + map.get(person5));

        System.out.println("Final Map:");
        System.out.println(map);
    }
}