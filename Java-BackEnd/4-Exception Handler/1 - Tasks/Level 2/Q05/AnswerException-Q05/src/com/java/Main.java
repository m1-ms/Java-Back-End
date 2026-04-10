package com.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Use FileReader

        try {
            FileReader fileReader = new FileReader("Data.jbg");

            int num;
            while ((num = fileReader.read()) != -1){
                System.out.println((char) num);
            }
        }
        catch (FileNotFoundException fileNotFoundException){
            System.out.println(" - File Not Found.");
        }
        catch (IOException ioException){
            System.out.println(" - Error read File.");
        }

        // Use Scanner

        try {
            File file = new File("Data.jbg");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println(" - File not Found.");
        }
    }
}