package com.java;

public class Main {
    public static void main(String[] args) {

        Employe emp = new Employe(101, "Ali");

        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Name: " + emp.getName());

        emp.setName("Ahmed");

        System.out.println("Updated Name: " + emp.getName());

        // emp.setEmployeeId(999);
    }
}