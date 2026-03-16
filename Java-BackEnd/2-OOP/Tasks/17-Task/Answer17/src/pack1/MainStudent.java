package pack1;

import java.util.Scanner;

public class MainStudent {

    public static void runStudent() {

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println(" ");
        System.out.println(" Student Info Data : ");

        // ID
        System.out.print(" - Enter ID Student : ");
        int idStudent = scanner.nextInt();

        if (idStudent > 0){
            student.idStudent = idStudent;
        }
        else {
            System.out.println(" Invalid ID ");
        }

        scanner.nextLine();

        // NAME
        System.out.print(" - Enter Name Student : ");
        String nameStudent = scanner.nextLine();

        if (nameStudent != null && nameStudent.length() >= 3
                && nameStudent.matches("[A-Za-z ]+")) {

            student.nameStudent = nameStudent;
        }
        else {
            System.out.println(" Invalid Name ");
        }

        // GRADE
        System.out.print(" - Enter Grade Student : ");
        double gradeStudent = scanner.nextDouble();

        if (gradeStudent > 0 && gradeStudent <= 100) {
            student.gradeStudent = gradeStudent;
        }
        else {
            System.out.println(" Invalid Grade ");
        }

        // Print
        System.out.println(" --- Student Info --- ");
        System.out.println(" - ID Student : " + student.idStudent);
        System.out.println(" - Name Student : " + student.nameStudent);
        System.out.println(" - Grade Student : " + student.gradeStudent);
    }
}