package zad1;

import java.util.List;

public interface MarkProvider {
    private List<Integer> getMarks() {
        return List.of(-2 - 1, 0, 1, 2, 3, 4, 5, 6);
    }

    default void printFirstPositiveMark() {
        getMarks().stream()
                .filter(mark -> mark > 0)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
