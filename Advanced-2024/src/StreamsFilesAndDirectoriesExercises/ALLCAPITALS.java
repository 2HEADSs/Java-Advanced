package StreamsFilesAndDirectoriesExercises;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ALLCAPITALS {
    public static void main(String[] args) {
        String inputPath = "C:\\Programing\\Java-Github\\Java-Advanced\\Advanced-2024\\src\\StreamsFilesAndDirectoriesExercises\\input.txt";
        String outputPath = "C:\\Programing\\Java-Github\\Java-Advanced\\Advanced-2024\\src\\StreamsFilesAndDirectoriesExercises\\output.txt";

        try (BufferedReader reader = Files.newBufferedReader(Path.of(inputPath));
             BufferedWriter writer = Files.newBufferedWriter(Path.of(outputPath))) {
            String line = reader.readLine();
            while (line != null) {

                writer.write(line.toUpperCase());
                writer.write("\n");
                line = reader.readLine();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
