package com.java;

public class Print {
    public void printStudent(Student student) {
        System.out.println(" > ---------------------------------------------- <");
        System.out.println(" ");
        System.out.println(" --- Student Data Info --- ");
        System.out.println(" ");
        System.out.println(" - Student First Name : " + student.getFirstNameStudent());
        System.out.println(" - Student Second Name : " + student.getSecondNameStudent());
        System.out.println(" - Student Age : " + student.getAgeStudent() + " " + " Years");
        System.out.println(" - Student Phone Number : " + student.getPhoneNumberStudent());
        System.out.println(" ");
    }

    public void printCourse(Course course) {
        System.out.println(" > ---------------------------------------------- <");
        System.out.println(" ");
        System.out.println(" --- Course Data Info --- ");
        System.out.println(" ");
        System.out.println(" - Course Name : " + course.getNameCourse());
        System.out.println(" - Course ID : " + course.getId());
        System.out.println(" ");
        System.out.println(" > ---------------------------------------------- <");
    }
}
