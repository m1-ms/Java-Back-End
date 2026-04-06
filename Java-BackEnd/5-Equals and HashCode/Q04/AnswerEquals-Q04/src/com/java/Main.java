package com.java;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        System.out.println(" -- Product HashSet -- ");
        HashSet <Product> products = new HashSet<>();
        products.add(new Product(1 , 100));
        products.add(new Product(2 , 200));
        products.add(new Product(1 , 300));
        for (Product product : products){
            System.out.println(product);
        }

        System.out.println(" ");

        System.out.println(" -- Student By ID --");
        Student.compareById = true;
        HashSet<Student> studentsByID = new HashSet<>();
        studentsByID.add(new Student(1, "mohamed2@gmail.com"));
        studentsByID.add(new Student(1, "osama25@gmail.com"));
        for (Student studentId : studentsByID) {
            System.out.println(studentId);
        }

        System.out.println(" ");

        System.out.println(" -- Student By Email -- ");
        Student.compareById = false;
        HashSet<Student> studentsByEmail = new HashSet<>();
        studentsByEmail.add(new Student(1, "mohamed2@gmail.com"));
        studentsByEmail.add(new Student(2, "mohamed2@gmail.com"));
        for (Student studentEmail : studentsByEmail) {
            System.out.println(studentEmail);
        }

        System.out.println(" ");

        System.out.println(" -- Car -- ");
        HashSet<Car> cars = new HashSet<>();
        cars.add(new Car(125 , "RED"));
        cars.add(new Car(1552 , "BLUE"));
        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println(" ");

        System.out.println(" -- Car HashMap Simulation -- ");
        HashMap<Car, String> carHashMap = new HashMap<>();
        Car car = new Car(125, "RED");
        carHashMap.put(car, " > Owned by Mohamed < ");
        System.out.println(" - Before change : " + carHashMap.get(car));
        car.setPlateNumber(666);
        Car oldCar = new Car(125, "RED");
        System.out.println(" - After change : " + carHashMap.get(oldCar));
        System.out.println(" - Final Map : " + carHashMap);
    }
}