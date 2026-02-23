package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        create APP that Accept Player(id,name,number) and student(id , name,age) and print Data look!

        Scanner scanner = new Scanner(System.in);

        long idP;
        System.out.println(" - Enter ID Player : ");
        idP = scanner.nextLong();
        String nameP;
        System.out.println(" - Enter Name Player : ");
        nameP = scanner.next();
        int number;
        System.out.println(" - Enter Number Player : ");
        number = scanner.nextInt();

        long idS;
        System.out.println(" - Enter ID Student : ");
        idS = scanner.nextLong();
        String nameS;
        System.out.println(" - Enter Name Student : ");
        nameS = scanner.next();
        int age;
        System.out.println(" - Enter Age Student : ");
        age = scanner.nextInt();

        System.out.println(" ");
        System.out.println("------------------------------");
        System.out.println(" ");

        System.out.println("Player Info.");
        Player player = new Player();

        player.setId(idP);
        player.setName(nameP);
        player.setNumber(number);

        player.printInfoPlayer();

        System.out.println(" ");
        System.out.println("------------------------------");
        System.out.println(" ");

        System.out.println("Student Info.");
        Student student = new Student();

        student.setId(idS);
        student.setName(nameS);
        student.setAge(age);

        student.printInfoStudent();
    }
}