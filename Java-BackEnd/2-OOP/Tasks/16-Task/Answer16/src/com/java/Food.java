package com.java;

public class Food {
    // Food > Name / Price

    private String nameFood;
    private double priceFood;

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        if (nameFood != null && nameFood.length() >= 1 && nameFood.matches("[A-Za-z ]+")) {
            this.nameFood = nameFood;
        } else {
            System.out.println("Invalid Food Name.");
        }
    }

    public double getPriceFood() {
        return priceFood;
    }

    public void setPriceFood(double priceFood) {
        if (priceFood > 0) {
            this.priceFood = priceFood;
        } else {
            System.out.println("Invalid Food Price.");
        }
    }
}