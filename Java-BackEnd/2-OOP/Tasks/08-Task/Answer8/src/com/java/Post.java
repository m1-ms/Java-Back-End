package com.java;

public class Post {
    // accept (id,text,image)
    private int id;
    private String text;
    private String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        if (text.length()>3 && text.matches("[A-Za-z]+")){
            this.text = text;
        }
        else {
            System.out.println("Invalid Text.");
        }
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        if (image.matches("[A-Za-z]+")){
            this.image = image;
        }
       else {
            System.out.println("Invalid Image.");
        }
    }
    public interface SocialFBandLI {
        void showPost(Post post);
    }

}
