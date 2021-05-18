package zad2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        var integers = Arrays.asList(-2, -1, 0, 1, 2, 3, 4, 5);
        List<Integer> unmodifiableIntegers = List.copyOf(integers);

        List<Integer> positiveIntegers = unmodifiableIntegers.stream()
                .filter(integer -> integer > 0)
                .collect(Collectors.toList());

        positiveIntegers.add(99);
    }
}
