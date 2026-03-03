package com.java;

public class Teacher {

    private long id;               // id > 0
    private String name;           // size >=3 and all digits char(a-z)
    private float age;             // age >= 25 and age <= 60
    private String phoneNumber;    //  +20111390660 13 cher and start with +20
    private float salary;          // salary >= 3000

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        if (id > 0){
            this.id = id;
        }
        else {
            System.out.println("Invalid in data ID.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!=null && name.length()>=3 && name.matches("[a-zA-Z]+")){  //+
            this.name = name;
        }
        else {
            System.out.println("Invalid in data Name.");
        }
    }

    public float getAge() {

        return age;
    }

    public void setAge(float age) {
        if (age>=25 && age<=60){
            this.age = age;
        }
        else {
            System.out.println("Invalid in data Age.");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && phoneNumber.length()==13 && phoneNumber.startsWith("+20")){
            this.phoneNumber = phoneNumber;
        }
        else {
            System.out.println("Invalid in data PhoneNumber.");
        }
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        if (salary>=3000){
            this.salary = salary;
        }
        else {
            System.out.println("Invalid in data Salary.");
        }
    }

    public void PrintInfoTeacher (){
        System.out.println("------------------------");
        System.out.println(" ");
        System.out.println("Teacher Info.");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("PhoneNumber : " + phoneNumber);
        System.out.println("Salary : " + salary);
    }
}
