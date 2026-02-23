package com.java;

public class BaseEntity {

    //BaseEntity(id,name)

    private String name;
    private int id;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length()>=3 && name.matches("[a-zA-Z]+")){
            this.name = name;
        }
        else  {
            System.out.println("Invalid data in Name.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id>0){
            this.id = id;
        }
        else {
            System.out.println("Invalid data in ID.");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone.startsWith("+")){
            this.phone = phone;
        }
        else {
            System.out.println("Invalid data in Phone.");
        }
    }
}
