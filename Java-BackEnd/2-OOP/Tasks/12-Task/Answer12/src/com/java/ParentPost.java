package com.java;

public class ParentPost {

    protected int id;
    protected String text;

    public ParentPost(int id, String text) {

        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Invalid ID Post.");
        }

        if (text.matches("[A-Za-z ]+")) {
            this.text = text;
        } else {
            System.out.println("Invalid Text Post.");
        }
    }

    public void showPost() {
        System.out.println(" - Post ID : " + id);
        System.out.println(" - Post Text : " + text);
    }
}