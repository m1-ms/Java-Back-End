package com.java;

public class Main {
    public static void main(String[] args) {
        // id
        // name

        Student student1 = new Student(2552 , "Ali");
        Student student2 = new Student(2589 , "Mohamed");
        Student student3 = new Student(2541 , "Ayman");

        Student student4 = new Student(2002 , "Mano");

        System.out.println(" -- Student Info -- ");

        System.out.println(" 1. Student");
        System.out.println(" > ID : " + student1.getId());
        System.out.println(" > Name : " + student1.getName());
        System.out.println(" 2. Student");
        System.out.println(" > ID : " + student2.getId());
        System.out.println(" > Name : " + student2.getName());
        System.out.println(" 3. Student");
        System.out.println(" > ID : " + student3.getId());
        System.out.println(" > Name : " + student3.getName());
        System.out.println(" 4. Student");
        System.out.println(" > ID : " + student4.getId());
        System.out.println(" > Name : " + student4.getName());
        System.out.println(" ");

        student4.setName("Ahmed");
        System.out.println("After Update :");
        System.out.println(" 4. Student");
        System.out.println(" > ID : " + student4.getId());
        System.out.println(" > Name : " + student4.getName());
    }
}