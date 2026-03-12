package com.java;

public class Main {
    static void main(String[] args) {
        BaseSchool add = new AddStudent();
        add.addStudent();

        System.out.println("---------------------------------------");

        BaseSchool show = new ShowStudent();
        show.showStudent();
    }
}