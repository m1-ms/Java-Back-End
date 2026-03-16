package com.java;

public class Gift {
    // Gift > Name / same ID as Order

    private String nameGift;
    private int idGift;

    public String getNameGift() {
        return nameGift;
    }

    public void setNameGift(String nameGift) {
        if (nameGift != null && nameGift.matches("[A-Za-z ]+")) {
            this.nameGift = nameGift;
        } else {
            System.out.println("Invalid Gift Name.");
        }
    }

    public int getIdGift() {
        return idGift;
    }

    public void setIdGift(int idGift) {
        if (idGift > 0) {
            this.idGift = idGift;
        } else {
            System.out.println("Invalid Gift ID.");
        }
    }
}