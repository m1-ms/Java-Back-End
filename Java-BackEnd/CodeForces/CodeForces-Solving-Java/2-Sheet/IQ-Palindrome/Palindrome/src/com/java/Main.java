package com.java;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        N = scanner.nextInt();
        Palindrome palindrome = new Palindrome(N);

        int revNum;
        revNum = palindrome.revNumber();

        System.out.println(revNum);

        if (palindrome.NPalindrome()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}