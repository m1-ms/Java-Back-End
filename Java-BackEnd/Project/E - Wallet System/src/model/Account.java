package model;

import exception.*;
import java.util.ArrayList;
import java.util.List;

public class Account {

    private String name;
    private String userName;
    private String password;
    private String phoneNumber;
    private String email;
    private int age;
    private double balance;

    public Account(String name, String userName, String password, String phoneNumber, String email, int age) {
        setName(name);
        setUserName(userName);
        setPassword(password);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setAge(age);
        this.balance = 0;
    }


    // Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() >= 3 && name.matches("[A-Za-z ]+")) {
            this.name = name;
        } else {
            throw new InvalidNameException(name);
        }
    }

    // Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 100) {
            this.age = age;
        } else {
            throw new InvalidAgeException(age);
        }
    }

    // UserName
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        if (userName != null && userName.length() >= 3) {
            this.userName = userName;
        } else {
            throw new InvalidNameException(userName);
        }
    }

    // Password
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if (password != null && password.length() >= 6) {
            this.password = password;
        } else {
            throw new InvalidPasswordException();
        }
    }

    // PhoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && phoneNumber.matches("\\d{11}")) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new InvalidPhoneException(phoneNumber);
        }
    }

    // E-Mail
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            throw new InvalidEmailException(email);
        }
    }

    // Balance
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            throw new InvalidBalanceException(balance);
        }
    }

    // Transaction History
    private List<Transaction> transactions = new ArrayList<>();
    public List<Transaction> getTransactions() {
        return transactions;
    }
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }
}