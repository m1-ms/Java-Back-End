package com.java;

public class User {

    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }


    public boolean checkPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public void setPassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            System.out.println("Password changed successfully");
        } else {
            System.out.println("Incorrect old password");
        }
    }
}