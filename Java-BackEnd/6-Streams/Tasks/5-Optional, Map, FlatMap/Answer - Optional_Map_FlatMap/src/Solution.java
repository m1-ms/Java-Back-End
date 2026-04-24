import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Solution {

    // Q - Optional, Map, FlatMap
    // 1 - Flatten a list of lists into a single list.
    // 2 - Extract all unique characters from a list of words.
    // 3 - Filter a list of Optionals and collect non-empty values.
    // 4 - Map a list of strings to their lengths.
    // 5 - Return a list of uppercased words that start with “A”.

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
    public List<String> flattenNestedWords() {
        return nestedWords.stream().flatMap(List::stream)
                .collect(Collectors.toList());
    }


    // Answer Task 2
    public List<Character> getUniqueCharacters() {
        return names.stream().filter(n -> n != null && !n.isEmpty())
                .flatMap(n -> n.chars().mapToObj(c -> (char) c))
                .distinct().collect(Collectors.toList());
    }


    // Answer Task 3
    public List<String> filterOptionals() {
        List<Optional<String>> optionals = Arrays.asList(Optional.of("Ali"),
                Optional.empty(), Optional.of("Sara"), Optional.empty(), Optional.of("Mona")
        );

        return optionals.stream().filter(Optional::isPresent)
                .map(Optional::get).collect(Collectors.toList());
    }


    // Answer Task 4
    public List<Integer> getNameLengths() {
        return names.stream().filter(n -> n != null && !n.isEmpty())
                .map(String::length).collect(Collectors.toList());
    }


    // Answer Task 5
    public List<String> getUpperStartWithA() {
        return names.stream().filter(n -> n != null && !n.isEmpty())
                .filter(n -> n.startsWith("A")).map(String::toUpperCase).collect(Collectors.toList());
    }

}
