package com.java;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File file = new File();

        try {
            file.readFile();
        }
        catch (IOException exception){
            System.out.println(" - File Not Found.");
        }
        System.out.println(" - Program Continue");
    }
}