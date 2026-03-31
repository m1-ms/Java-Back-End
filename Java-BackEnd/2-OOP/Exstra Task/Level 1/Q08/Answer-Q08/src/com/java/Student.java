package com.java;

public class Student {

    private int id;
    private String name;
    private int age;

    private static int count = 0;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        if (id >= 1) {
            this.id = id;
        }
    }

    public void setName(String name) {
        if (name != null && name.length() >= 3 && name.matches("[A-Za-z ]+")) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age >= 10 && age <= 50) {
            this.age = age;
        }
    }

    public Student() {
        count++;
    }
    public static int getCount() {
        return count;
    }
}