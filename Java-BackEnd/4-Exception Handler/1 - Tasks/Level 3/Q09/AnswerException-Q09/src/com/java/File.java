package com.java;

import java.io.FileReader;
import java.io.IOException;

public class File {
    public void readFile() throws IOException{
        FileReader fileReader = new FileReader(" Text.txt ");
        System.out.println(" - File Open Successfully.");
    }
}
