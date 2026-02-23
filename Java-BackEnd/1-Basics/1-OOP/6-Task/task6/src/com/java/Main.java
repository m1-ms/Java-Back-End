//Please Create App that accept id , name of privateschool
//        && id, name of puplicschool Student
//and print them (with oop)

package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // C = Public
        // V = Private

        // Private Info
        System.out.println(" > Enter Info Private School. < ");
        int idV;
        System.out.println("Enter ID (Private School) : ");
        idV = scanner.nextInt();
        String nameV;
        System.out.println("Enter Name (Private School) : ");
        nameV = scanner.next();

        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");

        // Public Info
        System.out.println(" > Enter Info Private School. < ");
        int idC;
        System.out.println("Enter ID (Public School) : ");
        idC = scanner.nextInt();
        String nameC;
        System.out.println("Enter Name (Public School) : ");
        nameC = scanner.next();

        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");

        // Private Print Info
        PrivateSchool schoolV = new PrivateSchool();
        schoolV.setId(idV);
        schoolV.setName(nameV);
        schoolV.printInfoPrivateSchool();

        // Public Info
        PuplicSchool schoolC = new PuplicSchool();
        schoolC.setId(idC);
        schoolC.setName(nameC);
        schoolC.printInfoPublicSchool();
    }
}
