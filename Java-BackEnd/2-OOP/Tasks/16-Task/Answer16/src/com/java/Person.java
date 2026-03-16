package com.java;

public class Person {
    // Person > Name / Phone / Address

    private String namePerson;
    private String phoneNumberPerson;
    private String addressPerson;

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        if (namePerson != null && namePerson.length() >= 3
                && namePerson.matches("[A-Za-z ]+")) {
            this.namePerson = namePerson;
        } else {
            System.out.println("Invalid Person Name.");
        }
    }

    public String getPhoneNumberPerson() {
        return phoneNumberPerson;
    }

    public void setPhoneNumberPerson(String phoneNumberPerson) {
        if (phoneNumberPerson != null && phoneNumberPerson.length() >= 10
                && phoneNumberPerson.startsWith("+") && phoneNumberPerson.matches("[0-9]+") ) {
            this.phoneNumberPerson = phoneNumberPerson;
        } else {
            System.out.println("Invalid Person Phone Number.");
        }
    }

    public String getAddressPerson() {
        return addressPerson;
    }

    public void setAddressPerson(String addressPerson) {
        this.addressPerson = addressPerson;
    }
}