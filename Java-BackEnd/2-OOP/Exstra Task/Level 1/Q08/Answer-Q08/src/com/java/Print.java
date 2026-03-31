package com.java;

public class Print {

    Student student = new Student();

    public void printStudent(Student student) {
        System.out.println(" ");
        System.out.println(" -------------------------------------------- ");
        System.out.println(" ");
        System.out.println(" >> Student Info : ");
        System.out.println(" * ID   : " + student.getId());
        System.out.println(" * Name : " + student.getName());
        System.out.println(" * Age  : " + student.getAge());
        System.out.println(" -------------------------------------------- ");
    }

    public void printTotal() {
        System.out.println(" ");
        System.out.println("Total Students Created: " + Student.getCount());
        System.out.println(" ");
    }
}