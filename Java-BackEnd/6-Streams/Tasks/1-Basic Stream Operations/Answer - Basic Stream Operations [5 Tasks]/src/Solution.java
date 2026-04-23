import java.util.*;
import java.util.stream.*;

public class Solution {

    // Q - Tasks
    //    1 - Filter even numbers from a list of integers.
    //    2 - Find names starting with a specific letter from a list of strings.
    //    3 - Convert all strings to uppercase using stream.
    //    4 - Sort a list of integers in descending order using streams.
    //    5 - Remove duplicate elements from a list using distinct().


    // Answer Task 1
    List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);

    public List<Integer> getEvenNumbers() {
        return numbers.stream()
                .filter(n -> n % 2 == 0).collect(Collectors.toList());
    }


    // Answer Task 2
    List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);

    public List<String> getNamesStartingWith(char letter) {
        return names.stream()
                .filter(n -> n != null && !n.isEmpty())
                .filter(n -> n.startsWith(String.valueOf(letter)))
                .collect(Collectors.toList());
    }


    // Answer Task 3
    public List<String> getUpperCaseNames() {
        return names.stream()
                .filter(n -> n != null && !n.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }


    // Answer Task 4
    public List<Integer> getSortedDescending() {
        return numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }


    // Answer Task 5
    public List<Integer> getDistinctNumbers() {
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}