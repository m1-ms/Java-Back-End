import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    // Q - Advanced Operations Tasks
    // 1 - Sort a list of employees by salary then by name.
    // 2 - Find the second-highest number in a list.
    // 3 - Find duplicate elements in a list of integers.
    // 4 - Remove null or empty strings from a list using stream.
    // 5 - Partition students into pass/fail groups based on grade.

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

    List<List<String>> nestedWords = Arrays.asList(
            Arrays.asList("Java", "Stream"),
            Arrays.asList("API", "Lambda"),
            Arrays.asList("FlatMap", "Map")
    );

    // Answer Task 1
    public List<Employee> sortSalaryByName() {
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .thenComparing(Employee::getName)).collect(Collectors.toList());
    }


    // Answer Task 2
    public Optional<Integer> secondHighest() {
        return numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
    }


    // Answer Task 3
    public List<Integer> duplicateNumbers() {
        Set<Integer> seen = new HashSet<>();
        return numbers.stream().filter(n -> !seen.add(n))
                .distinct().collect(Collectors.toList());
    }


    // Answer Task 4
    public List<String> removeNullAndEmpty() {
        return names.stream().filter(n -> n != null && !n.isEmpty()).collect(Collectors.toList());
    }


    // Answer Task 5
    public Map<Boolean, List<Student>> partitionStudentGrade() {
        return students.stream().collect(Collectors.partitioningBy(s -> s.getGrade() >= 60));
    }

}