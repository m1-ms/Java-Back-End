package com.java;

import java.util.Objects;

public class Car {
    // car > plateNumber - color

    private int plateNumber;
    private String color;

    public Car(int plateNumber, String color) {
        this.plateNumber = plateNumber;
        this.color = color;
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    public String getColor() {
        return color;
    }

    public void setPlateNumber(int plateNumber) {
        if (plateNumber>0){
            this.plateNumber = plateNumber;
        }
        else {
            System.out.println(" - Invalid PlateNumber of Car.");
        }
    }

    public void setColor(String color) {
        if (color!=null && color.length()>=3 && color.matches("[A-Za-z ]+")){
            this.color = color;
        }
        else {
            System.out.println(" - Invalid Color of Car.");
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass())
            return false;
        Car car = (Car) object;
        return Objects.equals(this.plateNumber, car.plateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber);
    }

    @Override
    public String toString() {
        return "Car : [ PlateNumber = ' " + plateNumber + "' , Color = ' " + color + " ']";
    }
}
