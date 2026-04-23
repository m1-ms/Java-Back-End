import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Solution {

    // Q  - Numeric Streams & Reductions
    //    1 - Calculate the sum of a list of integers using reduce.
    //    2 - Find the maximum and minimum value in a list.
    //    3 - Calculate the average of a list of doubles.
    //    4 - Multiply all integers in a list together using reduce.
    //    5 - Count how many numbers are positive in a list.


    // Answer Task 1
    List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
    public int getSumWithReduce() {
        return numbers.stream()
                .reduce(0, Integer::sum);
    }


    // Answer Task 2
    public Optional<Integer> getMax() {
        return numbers.stream()
                .max(Integer::compareTo);
    }

    public Optional<Integer> getMin() {
        return numbers.stream()
                .min(Integer::compareTo);
    }


    // Answer Task 3
    public OptionalDouble getAverage() {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .average();
    }


    // Answer Task 4
    public int getProductWithReduce() {
        return numbers.stream()
                .filter(n -> n != 0)
                .reduce(1, (a, b) -> a * b);
    }


    // Answer Task 5
    public long countPositiveNumbers() {
        return numbers.stream()
                .filter(n -> n > 0)
                .count();
    }

}
