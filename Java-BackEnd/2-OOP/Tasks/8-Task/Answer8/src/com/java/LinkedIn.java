package com.java;

public class LinkedIn implements Post.SocialFBandLI {  // Error
    @Override
    public void showPost(Post postFBLI) {
        System.out.println("You are on application LinkedIn : ");
        System.out.println("Post ID: " + postFBLI.getId());
        System.out.println("Text: " + postFBLI.getText());
        System.out.println("Image: " + postFBLI.getImage());
    }
}
