package com.java;

import com.java.ShareData;

public class Student extends ShareData {
//    student (age) extend ShareData(phone)
//    student (id,name,age,phone)

    public void printInfoStudent(){
        System.out.println("----------------------------------------");
        System.out.println(" > Student Info <");
        System.out.println("ID Student : " + getId());
        System.out.println("Name Student : " + getName());
        System.out.println("Age Student : " + getAge());
        System.out.println("Phone Student : " + getPhone());
        System.out.println("----------------------------------------");
    }
}