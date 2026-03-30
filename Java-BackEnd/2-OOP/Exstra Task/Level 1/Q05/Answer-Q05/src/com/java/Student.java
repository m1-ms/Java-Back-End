package com.java;

public class Student {
    // Student > id - name - age - phoneNumber - email
    private int id;
    private String name;
    private int age;
    private String phoneNumber;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id>0){
            this.id = id;
        }
        else {
            System.out.println(" - Invalid ID.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!=null && name.length()>=3 && name.matches("[A-Za-z ]+")){
            this.name = name;
        }
        else {
            System.out.println(" - Invalid Name.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=8 && age<=50){
            this.age = age;
        }
        else {
            System.out.println(" - Invalid Age.");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber!=null && phoneNumber.length()>=4 && phoneNumber.matches("\\d+")){
            this.phoneNumber = phoneNumber;
        }
        else {
            System.out.println(" - Invalid PhoneNumber. ");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email!=null && email.endsWith("@gmail.com")){
            this.email = email;
        }
        else {
            System.out.println(" - Invalid E-Mail. ");
        }
    }
    public void printStudentData(){
        System.out.println(" ");
        System.out.println(" -------------------------------------------------- ");
        System.out.println(" ");
        System.out.println(" > ID Student : " + id);
        System.out.println(" > Name Student : " + name);
        System.out.println(" > Age Student : " + age);
        System.out.println(" > Phone Number Student : " + phoneNumber);
        System.out.println(" > E-Mail Student : " + email);
    }
}
