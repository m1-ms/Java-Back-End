package com.java;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        setId(id);
        setName(name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println(" - invalid ID.");
        }
    }

    public void setName(String name) {
        if (name != null && name.length() >= 3 && name.matches("[A-Za-z ]+")) {
            this.name = name;
        } else {
            System.out.println(" - invalid Name.");
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Person person = (Person) object;
        return this.id == person.id && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}