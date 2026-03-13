package com.java;

import java.util.ArrayList;

public class FaceBook {

    private ArrayList<ParentPost> posts = new ArrayList<>();

    public void addPost(ParentPost post) {
        posts.add(post);
    }

    public void showPosts() {

        for (ParentPost post : posts) {
            post.showPost();
            System.out.println(" -------------------------------- ");
        }
    }
}