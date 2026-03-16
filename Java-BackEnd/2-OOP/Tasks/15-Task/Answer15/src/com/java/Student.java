package com.java;

public class Student {
    // name (first / second)- age - phone number

    private String firstNameStudent;
    private String secondNameStudent;
    private int ageStudent;
    private String phoneNumberStudent;

    public String getFirstNameStudent() {
        return firstNameStudent;
    }

    public void setFirstNameStudent(String firstNameStudent) {
        if (firstNameStudent!=null && firstNameStudent.matches("[A-Za-z ]+")
                && firstNameStudent.length()>=3){
            this.firstNameStudent = firstNameStudent;
        }
        else {
            System.out.println("Invalid First Name Of Student.");
        }
    }

    public String getSecondNameStudent() {
        return secondNameStudent;
    }

    public void setSecondNameStudent(String secondNameStudent) {
        if (secondNameStudent != null && secondNameStudent.matches("[A-Za-z ]+")
                && secondNameStudent.length() >= 3) {
            this.secondNameStudent = secondNameStudent;
        } else {
            System.out.println("Invalid Second Name Of Student.");
        }
    }

    public int getAgeStudent() {
        return ageStudent;
    }

    public void setAgeStudent(int ageStudent) {
        if (ageStudent>=15 && ageStudent <=50){
            this.ageStudent = ageStudent;
        }
        else {
            System.out.println("Invalid Age Student.");
        }
    }

    public String getPhoneNumberStudent() {
        return phoneNumberStudent;
    }

    public void setPhoneNumberStudent(String phoneNumberStudent) {
        if (phoneNumberStudent!=null && phoneNumberStudent.startsWith("+")
                && phoneNumberStudent.length()>10) {
            this.phoneNumberStudent = phoneNumberStudent;
        }
        else {
            System.out.println("Invalid Phone Number Of Student.");
        }
    }
}
