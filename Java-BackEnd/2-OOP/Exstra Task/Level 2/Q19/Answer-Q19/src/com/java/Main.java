package com.java;

public class Main {
    public static void main(String[] args) {

        User user = new User("Ali", "1234");

        System.out.println("Username: " + user.getUsername());

        System.out.println(user.checkPassword("1234")); // true
        System.out.println(user.checkPassword("0000")); // false

        user.setPassword("1234", "5678");

        System.out.println(user.checkPassword("5678")); // true
    }
}