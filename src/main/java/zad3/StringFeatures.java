package zad3;

public class StringFeatures {
    public static void main(String[] args) {
        " ".isBlank();
        // true

        " ".isEmpty();
        // false


        "B\nAB\nAB".lines();
        // [B, AB, AB]

        " DB ".strip();
        // DB

        " DB ".stripLeading();
        // "DB "

        " DB ".stripTrailing();
        // " DB"
        "=".repeat(5);
        // =====

    }

}
