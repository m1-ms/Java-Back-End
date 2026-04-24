import java.util.Arrays;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    // Q - Collectors & Grouping
    //    1 - Group a list of students by their department.
    //    2 - Partition a list of numbers into even and odd using partitioningBy.
    //    3 - Create a comma-separated string from a list of strings.
    //    4 - Group employees by age and count how many per age.
    //    5 - Find the average salary per department in a list of employees.

    // Main Details
    List<Student> students = Arrays.asList(
            new Student("Ali", "IT", 85),
            new Student("Mona", "CS", 92),
            new Student("Ahmed", "IT", 60),
            new Student("Sara", "CS", 70),
            new Student("Omar", "IS", 45),
            new Student("Laila", "IS", 78)
    );

    List<Employee> employees = Arrays.asList(
            new Employee("Ali", 30, "HR", 5000),
            new Employee("Mona", 25, "IT", 7000),
            new Employee("Ahmed", 30, "HR", 5500),
            new Employee("Sara", 27, "IT", 7200),
            new Employee("Omar", 40, "Finance", 8000),
            new Employee("Laila", 35, "Finance", 8200)
    );

    List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);

    List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila",
            "Kareem", "Nada", "Nour", "Samy", "", null);

    // Answer Task 1
    // Collector<? super Student, ? extends Object, Map<String, List<Student>>> collector
    public Map<String,List<Student>> getStudentsDepartment(){
        return students.stream().collect(Collectors.groupingBy(Student::getDepartment));
    }


    // Answer Task 2
    public Map<Boolean, List<Integer>> partitionEvenOdd() {
        return numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
    }


    // Answer Task 3
    public String getNamesCommaSeparated() {
        return names.stream().filter(n -> n != null && !n.isEmpty()).collect(Collectors.joining(", "));
    }


    // Answer Task 4
    public Map<Integer,Long> getCountAge(){
        return employees.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.counting()));
    }


    // Answer Task 5
    public Map<String, Double> getAverageSalaryDepartment() {
        return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
    }

}
