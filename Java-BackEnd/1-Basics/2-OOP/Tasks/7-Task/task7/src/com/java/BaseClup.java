//Please Create App that accept
//id , name , number , Fcode of clupFc and
//id , name , number , Rcode of clupRel
//of Player Print
//id , name , number , code

package com.java;

public class BaseClup {

    private int id;
    private String name;
    private String number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0){
            this.id = id;
        }
        else {
            System.out.println("Invalid in data ID.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length()>=3 && name.matches("[a-zA-Z]+")){
            this.name = name;
        }
        else {
            System.out.println("Invalid in data Name.");
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if(number != null && number.length()<= 3){
            this.number = number;
        }
        else {
            System.out.println("Invalid in data Number.");
        }
    }
}
