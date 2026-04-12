package com.java;

public class Main {
    public static void main(String[] args) {

        BankAcc bankAcc = new BankAcc(1000);

        bankAcc.withdraw(500);
        bankAcc.withdraw(600);
        bankAcc.withdraw(-10);

        System.out.println("Final Balance: " + bankAcc.getBalance());
    }
}