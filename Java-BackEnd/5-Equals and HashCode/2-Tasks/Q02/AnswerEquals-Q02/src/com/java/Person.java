package com.java;

import java.util.Objects;

public class Person {
    // person > id - name

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        if (id > 0){
            this.id = id;
        }
        else {
            System.out.println(" - Invalid ID.");
        }
    }

    public void setName(String name) {
        if (name!=null && name.length()>=3 && name.matches("[A-Za-z ]+")){
            this.name = name;
        }
        else {
            System.out.println(" - Invalid Name.");
        }
    }

    @Override
    public String toString() {
        return "ID=" + id + ", Name=" + name;
    }

    // First
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Person)) return false;
        Person person = (Person) object;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    /*
    // Second
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Person)) return false;
        Person person = (Person) object;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }


    // Third
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Person)) return false;
        Person person = (Person) object;
        return id == person.id && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

     */

}
