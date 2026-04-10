package com.java;

public class ExceptionPropagate {

    public static void method2(){
        System.out.println(" - Inside Method [2].");
        int result = 10 / 0;
    }

    public static void method1(){
        System.out.println(" - Inside Method [1].");
        method2();
    }

}
