package com.java;

import java.util.Objects;

public class Student {
    // Student > id - email
    private int id;
    private String email;

    public Student(int id, String email) {
        this.id = id;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        if (id>0){
            this.id = id;
        }
        else {
            System.out.println(" - Invalid ID of Student.");
        }
    }

    public void setEmail(String email) {
        if (email!=null && email.length()>=3 && email.endsWith("@gmail.com")){
            this.email = email;
        }
        else {
            System.out.println(" - Invalid of E-Mail.");
        }
    }

    public static boolean compareById = true;

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;

        if (object == null || getClass() != object.getClass())
            return false;

        Student student = (Student) object;

        if (compareById) {
            return this.id == student.id;
        } else {
            return Objects.equals(this.email, student.email);
        }
    }

    @Override
    public int hashCode() {
        if (compareById) {
            return Objects.hash(id);
        } else {
            return Objects.hash(email);
        }
    }

    @Override
    public String toString() {
        return " > Student : [ ID = " + id + " , E-Mail = '" + email + " ' ]";
    }
}
