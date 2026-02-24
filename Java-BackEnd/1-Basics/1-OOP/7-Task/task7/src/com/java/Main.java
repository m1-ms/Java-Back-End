
package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Please Create App that accept
//id , name , number , Fcode of clupFc and
//id , name , number , Rcode of clupRel
//of Player Print
//id , name , number , code

        Scanner scanner = new Scanner(System.in);

        System.out.println( " ||  Club-FC & Club-REL || ");

        // Clup - FC
        int idFC;
        System.out.println("Enter ID Player Of Club - FC : ");
        idFC = scanner.nextInt();
        String nameFC;
        System.out.println("Enter Name Player Of Club - FC : ");
        nameFC = scanner.next();
        String numberFC;
        System.out.println("Enter Number Player Of Club - FC : ");
        numberFC = scanner.next();
        int Fcode;
        System.out.println("Enter Code Player Of Club - FC : ");
        Fcode = scanner.nextInt();

        // Clup - REL
        int idREL;
        System.out.println("Enter ID Player Of Club - REL : ");
        idREL = scanner.nextInt();
        String nameREL;
        System.out.println("Enter Name Player Of Club - REL : ");
        nameREL = scanner.next();
        String numberREL;
        System.out.println("Enter Number Player Of Club - REL : ");
        numberREL = scanner.next();
        int Rcode;
        System.out.println("Enter Code Player Of Club - REL : ");
        Rcode = scanner.nextInt();

        // Print
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");

        ClupFc playerFc = new ClupFc();
        playerFc.setId(idFC);
        playerFc.setName(nameFC);
        playerFc.setNumber(numberFC);
        playerFc.setFcode(Fcode);
        playerFc.printClupFc();

        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");

        ClupRel playerRel = new ClupRel();
        playerRel.setId(idREL);
        playerRel.setName(nameREL);
        playerRel.setNumber(numberREL);
        playerRel.setRcode(Rcode);
        playerRel.printClupRel();
    }
}