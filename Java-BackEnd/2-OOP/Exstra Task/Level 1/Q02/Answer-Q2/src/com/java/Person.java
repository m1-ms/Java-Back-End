package com.java;

public class Person {
    // Name
    // Age
    // PhoneNumber
    // Email

    private String name;
    private int age;
    private String phoneNumber;
    private String email;

    // Name
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

    // Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>10 && age<=100){
            this.age = age;
        }
        else {
            System.out.println(" - Invalid Age.");
        }
    }

    // Phone Number
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber!=null && phoneNumber.startsWith("+") && phoneNumber.length()>4
                && phoneNumber.matches("\\+[0-9]+")){
            this.phoneNumber = phoneNumber;
        }
        else {
            System.out.println(" - Invalid PhoneNumber.");
        }
    }

    // Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.endsWith("@gmail.com")){
            this.email = email;
        }
        else {
            System.out.println(" - Invalid Email.");
        }
    }

    public void printPersonInfo(){
        System.out.println(" -------------------------------------------- ");
        System.out.println(" ");
        System.out.println("  --  Person Info  --  ");
        System.out.println(" - Person Name : " + name);
        System.out.println(" - Person Age : " + age);
        System.out.println(" - Person PhoneNumber : " + phoneNumber);
        System.out.println(" - Person E-Mail : " + email);
    }
}
