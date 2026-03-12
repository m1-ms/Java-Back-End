package com.java;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Post ID: ");
        int id;
        id = scanner.nextInt();

        scanner.nextLine(); // to skip line (chat help me:)

        System.out.print("Enter Post Text: ");
        String text;
        text = scanner.nextLine();

        System.out.print("Enter Image name: ");
        String image;
        image = scanner.nextLine();

        Post post = new Post();
        post.setId(id);
        post.setText(text);
        post.setImage(image);

        FaceBook facebook = new FaceBook();
        facebook.showPost(post);

        System.out.println();

        LinkedIn linkedIn = new LinkedIn();
        linkedIn.showPost(post);

    }
}