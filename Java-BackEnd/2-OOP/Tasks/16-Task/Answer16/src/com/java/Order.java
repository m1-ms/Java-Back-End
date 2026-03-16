package com.java;

import java.util.List;

public class Order {
    // Order > ID / Person / Foods / Bill / Gift

    private int id;
    private Person person;
    private List<Food> foods;
    private Bill bill;
    private Gift gift;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Invalid ID.");
        }
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Gift getGift() {
        return gift;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }

    public void showOrder() {
        System.out.println(" Order ID : " + id);
        System.out.println(" Customer : " + person.getNamePerson());
        System.out.println(" Address : " + person.getAddressPerson());
        System.out.println(" Phone : " + person.getPhoneNumberPerson());
        System.out.println(" Foods :");
        for (Food food : foods) {
            System.out.println(food.getNameFood() + " - $" + food.getPriceFood());
        }
        System.out.println(" Total Bill : $" + bill.getTotalPriceBill());
        if (gift.getNameGift() != null) {
            System.out.println(" Gift : " + gift.getNameGift());
        }
    }
}