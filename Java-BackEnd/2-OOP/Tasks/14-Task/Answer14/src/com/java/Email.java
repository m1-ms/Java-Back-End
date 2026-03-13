package com.java;

public class Email {
    // Mail
    private String mail;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        if (mail != null && mail.endsWith("@gmail.com")){
            this.mail = mail;
        }
        else {
            System.out.println("Invalid Email.");
        }
    }

    public void printEmailData(){
        System.out.println(" - Email : " + mail);
    }
}
