package com.java;

import java.util.Objects;

public class Product {
    // code - price

    private int code;
    private double price;

    public Product(int code, double price) {
        this.code = code;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        if (code>0){
            this.code = code;
        }
        else {
            System.out.println(" - Invalid Code.");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>0){
            this.price = price;
        }
        else {
            System.out.println(" - Invalid Price.");
        }
    }

    @Override
    public boolean equals(Object object){
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        Product product = (Product) object;
        return code == product.code;
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return " > Product [ Code = " + code + " , Price = " + price + " ]";
    }
}
