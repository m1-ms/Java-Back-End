package com.java;

public class BaseEntity {

    //                - id must be > 0

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        if (id > 0) {
            this.id = id;
        }
        else {
            System.out.println("Invalid in ID.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length()>=3 && name.matches("[a-zA-Z]+")) {
            this.name = name;
        }
        else {
            System.out.println("Invalid in Name.");
        }
    }
}
