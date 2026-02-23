package com.java;

import com.java.BaseEntity;

public class Person extends BaseEntity {
    //Person() extend BaseEntity(id,name)
    //Person(id,name)

    public void printInfoPerson(){
        System.out.println("----------------------------------------");
        System.out.println(" > Person Info <");
        System.out.println("ID Person : " + getId());
        System.out.println("Name Person : " + getName());
        System.out.println("----------------------------------------");
    }
}
