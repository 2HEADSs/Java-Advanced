package StreamsFilesAndDirectoriesExercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

public class CountCharacterTypes {
    public static void main(String[] args) {
        String inputPath = "C:\\Programing\\Java-Github\\Java-Advanced\\Advanced-2024\\src\\StreamsFilesAndDirectoriesExercises\\input.txt";
        String outputPath = "C:\\Programing\\Java-Github\\Java-Advanced\\Advanced-2024\\src\\StreamsFilesAndDirectoriesExercises\\output2.txt";

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        Set<Character> punctuation = Set.of('!', '?', '.', ',');
        int vowelsCount = 0;
        int punctuations = 0;
        int othersCount = 0;
        try (BufferedReader reader = Files.newBufferedReader(Path.of(inputPath));
             BufferedWriter writer = Files.newBufferedWriter(Path.of(outputPath))) {

            String line = reader.readLine();
            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    char symbol = line.charAt(i);
                    if (vowels.contains(symbol)) {
                        vowelsCount++;
                    } else if (punctuation.contains(symbol)) {
                        punctuations++;
                    } else if (symbol != ' ') {
                        othersCount++;
                    }
                }
                line = reader.readLine();
            }
            writer.write("Vowels: "+vowelsCount);
            writer.write("\n");
            writer.write("Other symbols: "+othersCount);
            writer.write("\n");
            writer.write("Punctuation: "+punctuations);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
