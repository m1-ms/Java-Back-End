package com.java;

public class Post extends ParentPost {

    private String image;

    public Post(int id, String text, String image) {
        super(id, text);
        this.image = image;
    }

    @Override
    public void showPost() {
        super.showPost();
        System.out.println(" - Image Post : " + image);

    }
}