package com.java;

public class School {
    private String nameSchool;

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        if (nameSchool != null && nameSchool.length() >= 3) {
            this.nameSchool = nameSchool;
        } else {
            System.out.println(" - Invalid School Name");
        }
    }
}