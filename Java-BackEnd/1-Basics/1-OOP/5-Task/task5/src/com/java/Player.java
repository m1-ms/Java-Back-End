package com.java;

import com.java.ShareData;

public class Player extends ShareData {
    //Player(id , name, number,phone)
    //Player(number) extend ShareData(phone)

    public void printInfoPlayer(){
        System.out.println("----------------------------------------");
        System.out.println(" > Player Info <");
        System.out.println("ID Player : " + getId());
        System.out.println("Name Player : " + getName());
        System.out.println("Number Player : " + getNumber());
        System.out.println("Phone Player : " + getPhone());
        System.out.println("----------------------------------------");
    }
}
