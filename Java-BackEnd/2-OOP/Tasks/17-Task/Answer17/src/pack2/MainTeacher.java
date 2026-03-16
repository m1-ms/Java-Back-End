package pack2;

import java.util.Scanner;

public class MainTeacher {

    public static void runTeacher() {

        Scanner scanner = new Scanner(System.in);
        Teacher teacher = new Teacher();

        teacher.activeTeacher = true;

        while (teacher.activeTeacher) {

            // ID
            System.out.print(" Enter Teacher ID: ");
            int idTeacher = scanner.nextInt();

            if (idTeacher > 0){
                teacher.idTeacher = idTeacher;
            }
            else {
                System.out.println(" Invalid ID ");
            }

            scanner.nextLine();

            // Name
            System.out.print(" Enter Teacher Name : ");
            String nameTeacher = scanner.nextLine();

            if (nameTeacher != null && nameTeacher.length() >= 3
                    && nameTeacher.matches("[A-Za-z ]+")) {

                teacher.nameTeacher = nameTeacher;
            }
            else {
                System.out.println(" Invalid Name ");
            }

            System.out.print(" Is Teacher Active ? (yes/no): ");
            teacher.activeTeacher = scanner.nextBoolean();

            // Print
            System.out.println(" --- Teacher Info --- ");
            System.out.println(" - ID : " + teacher.idTeacher);
            System.out.println(" - Name : " + teacher.nameTeacher);
            System.out.println(" - Active : " + teacher.activeTeacher);
        }
    }
}