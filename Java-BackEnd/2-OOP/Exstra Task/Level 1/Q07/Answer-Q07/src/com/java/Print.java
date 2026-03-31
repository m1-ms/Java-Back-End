package com.java;

import com.java.School;
import com.java.Student;

class Print {

    Student student = new Student();
    School school = new School();

    public void printStudent(Student student) {
        System.out.println(" ");
        System.out.println(" --------------------------------------------------- ");
        System.out.println(" ");
        System.out.println(" >>  Students Data : ");
        System.out.println(" > ID : " + student.getId());
        System.out.println(" > Name Student : " + student.getNameStudent());
        System.out.println(" > Grade : " + student.getGrade());
        System.out.println(" > School : " + student.getSchool().getNameSchool());
    }
}