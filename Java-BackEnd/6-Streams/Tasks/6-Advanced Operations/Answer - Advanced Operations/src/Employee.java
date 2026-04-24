public class Employee {

    // Employee >> Name - Age - Department - Salary

    private String name;
    private int age;
    private String department;
    private double salary;

    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!=null && name.length()>=3 && name.matches("[A-Za-z ]+")){
            this.name = name;
        }
        else {
            System.out.println("Invalid Name");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=10 && age <=100){
            this.age = age;
        }
        else {
            System.out.println("Invalid Age");
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department != null && department.matches("[A-Za-z ]+")) {
            this.department = department;
        } else {
            System.out.println("Invalid Department");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
