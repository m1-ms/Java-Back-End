package com.java;

import com.java.BaseEntity;

public class ShareData extends BaseEntity {
    //ShareData(phone) extend BaseEntity(id,name)
    //Player(number) extend ShareData(phone)
    // student (age) extend ShareData(phone)

    private long number;
    private int age;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        if (number>0) {
            this.number = number;
        }
        else {
            System.out.println("Invalid in data Number.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>16) {
            this.age = age;
        }
        else {
            System.out.println("Invalid in data Age.");
        }
    }
}
