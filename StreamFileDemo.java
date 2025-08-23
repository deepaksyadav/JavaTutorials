

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFileDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter out even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0) // Predicate: n is even
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers); // Output: Even numbers: [2, 4, 6, 8, 10]
    }
}
