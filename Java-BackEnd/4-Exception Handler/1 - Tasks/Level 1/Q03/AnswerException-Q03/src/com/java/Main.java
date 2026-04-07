package com.java;

import static com.java.StringNum.toUpper;

public class Main {
    public static void main(String[] args) {

        try {
            toUpper(null);
        }
        catch (NullPointerException nullPointerException){
            System.out.println(" - NullPointerException Occurred");
        }
    }

    /*
    // If i use another class i can make it on main class but if i don't that then time i can use it in main class
    public static void toUpper(String string){
        System.out.println(string.toUpperCase());
    }
    */

}