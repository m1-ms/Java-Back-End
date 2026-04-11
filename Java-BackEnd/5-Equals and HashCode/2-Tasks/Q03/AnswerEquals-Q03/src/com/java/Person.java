package com.java;

import java.util.Objects;

public class Person {
    // id - name
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
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
            System.out.println(" - Invalid ID.");
        }
    }

    public void setName(String name) {
        if (name != null && name.length() >= 3 && name.matches("[A-Za-z ]+")) {
            this.name = name;
        } else {
            System.out.println(" - Invalid Name.");
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (!(object instanceof Person))
            return false;
        Person person = (Person) object;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Print
    @Override
    public String toString() {
        return "Person : { ID = " + id + " , Name = " + name + " }";
    }
}