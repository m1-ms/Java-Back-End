package model;

public class Account {
    // full name - username - phone number - password - balance

    private String name;
    private String userName;
    private String phoneNumber;
    private String password;
    private double balance;

    // NAME
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() >= 3 && name.matches("[A-Za-z ]+")) {
            this.name = name;
        }
        else {
            System.out.println("Invalid Name");
        }
    }

    // PHONE NUMBER
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && phoneNumber.matches("\\d{11}")) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid PhoneNumber");
        }
    }

    // USERNAME
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName != null && userName.length() >= 3) {
            this.userName = userName;
        }
        else {
            System.out.println("Invalid UserName");
        }
    }

    // PASSWORD
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password != null && password.length() >= 6) {
            this.password = password;
        }
        else {
            System.out.println("Invalid Password");
        }
    }

    // BALANCE
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid Balance");
        }
    }
}
