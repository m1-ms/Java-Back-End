import java.util.*;
import java.util.stream.*;

public class Solution {

    //    Q - Intermediate Stream Tasks
    //  1 - Count the number of strings longer than 5 characters.
    //  2 - Find the first element in a stream that matches a given condition.
    //  3 - Check if any number is divisible by 5 in a list.
    //  4 - Collect elements into a Set instead of a List.
    //  5 - Skip the first 3 elements and return the rest.


    // Answer Task 1
    List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);
    public long countNamesLongerThan5() {
        return names.stream()
                .filter(n -> n != null && !n.isEmpty())
                .filter(n -> n.length() > 5).count();
    }


    // Answer Task 2
    List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
    public Optional<Integer> getFirstNumberGreaterThan7() {
        return numbers.stream()
                .filter(n -> n > 7).findFirst();
    }


    // Answer Task 3
    public boolean isAnyDivisibleBy5() {
        return numbers.stream()
                .anyMatch(n -> n % 5 == 0);
    }


    // Answer Task 4
    public Set<Integer> getNumbersAsSet() {
        return numbers.stream()
                .collect(Collectors.toSet());
    }


    // Answer Task 5
    public List<Integer> skipFirst3() {
        return numbers.stream()
                .skip(3)
                .collect(Collectors.toList());
    }

}
