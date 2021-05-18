package zad4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileChecker {
    public static void main(String[] args) throws IOException {
        long result = Files.mismatch(new File("src/main/java/zad4/lorem1.txt").toPath(), new File("src/main/java/zad4/lorem2.txt").toPath());
        // returns -1 when the same file

        result = Files.mismatch(new File("src/main/java/zad4/lorem1.txt").toPath(), new File("src/main/java/zad4/otherFile.txt").toPath());
        // returns 32 - byte number of first mismatch
    }
}
