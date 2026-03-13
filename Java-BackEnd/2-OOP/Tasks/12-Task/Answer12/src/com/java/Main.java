package com.java;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    FaceBook faceBook = new FaceBook();

    System.out.println("Enter Post ID : ");
    int id = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Enter Post Text : ");
    String text = scanner.nextLine();

    System.out.println("Do you want to add image? ( yes/no ) ... ");
    String answer = scanner.nextLine();

    if (answer.equalsIgnoreCase("yes")) {

      System.out.println("Enter Image : ");
      String image = scanner.nextLine();

      Post post = new Post(id, text, image);
      faceBook.addPost(post);

    } else {

      ParentPost post = new ParentPost(id, text);
      faceBook.addPost(post);
    }

    System.out.println("All Data Post : ");
    faceBook.showPosts();

    scanner.close();
  }
}