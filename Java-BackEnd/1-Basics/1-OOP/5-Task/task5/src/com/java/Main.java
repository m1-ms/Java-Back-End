//Please Create App that accept
//Person(id,name)
//Player(id , name, number,phone)
//student (id,name,age,phone) wit oop


//Player(number) extend ShareData(phone) extend BaseEntity(id,name) done
//student (age) extend ShareData(phone) extend BaseEntity(id,name) done
//wit oop

package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Person
        System.out.println(" > Enter Person Info.");
        int idPS;
        System.out.println("Enter Person ID : ");
        idPS = scanner.nextInt();
        String namePS;
        System.out.println("Enter Person Name : ");
        namePS = scanner.next();
        System.out.println("----------------------------------------");

        // Player
        System.out.println(" > Enter Player Info.");
        int idPR;
        System.out.println("Enter Player ID : ");
        idPR = scanner.nextInt();
        String namePR;
        System.out.println("Enter Player Name : ");
        namePR = scanner.next();
        long numberPR;
        System.out.println("Enter Number Player : ");
        numberPR = scanner.nextLong();
        String phonePR;
        System.out.println("Enter Phone Player : ");
        phonePR = scanner.next();
        System.out.println("----------------------------------------");

        // Student
        System.out.println(" > Enter Student Info.");
        int idS;
        System.out.println("Enter Student ID : ");
        idS = scanner.nextInt();
        String nameS;
        System.out.println("Enter Student Name : ");
        nameS = scanner.next();
        int ageS;
        System.out.println("Enter Age Student : ");
        ageS = scanner.nextInt();
        String phoneS;
        System.out.println("Enter Phone Student : ");
        phoneS = scanner.next();
        System.out.println("----------------------------------------");

        // Person Print
        Person person = new Person();
        person.setName(namePS);
        person.setId(idPS);
        person.printInfoPerson();

        // Player Print
        Player player = new Player();
        player.setId(idPR);
        player.setName(namePR);
        player.setNumber(numberPR);
        player.setPhone(phonePR);
        player.printInfoPlayer();

        // Student Print
        Student student = new Student();
        student.setId(idS);
        student.setName(nameS);
        student.setAge(ageS);
        student.setPhone(phoneS);
        student.printInfoStudent();

    }
}