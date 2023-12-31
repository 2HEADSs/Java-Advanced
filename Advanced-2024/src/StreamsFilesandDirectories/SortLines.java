package StreamsFilesandDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SortLines {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/StreamsFilesandDirectories/input.txt");

        List<String> lines = Files.readAllLines(path).stream()
                .sorted()
                .toList();

        Path outputPath = Paths.get("sorted-lines.txt");

        Files.write(outputPath,lines);
    }
}
