public class Student {

    // Student > Name - Department - Grade

    private String name;
    private String department;
    private double grade;

    public Student(String name, String department, double grade) {
        this.name = name;
        this.department = department;
        this.grade = grade;
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade>=0 && grade<=100){
            this.grade = grade;
        }
        else {
            System.out.println("Invalid Grade");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
