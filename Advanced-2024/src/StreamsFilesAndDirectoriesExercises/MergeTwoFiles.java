package StreamsFilesAndDirectoriesExercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class MergeTwoFiles {
    public static void main(String[] args) {
        String inputOne = "C:\\Programing\\Java-Github\\Java-Advanced\\Advanced-2024\\src\\StreamsFilesAndDirectoriesExercises\\Exercises Resources\\inputOne.txt";
        String inputTwo = "C:\\Programing\\Java-Github\\Java-Advanced\\Advanced-2024\\src\\StreamsFilesAndDirectoriesExercises\\Exercises Resources\\inputTwo.txt";
        String outputPath = "C:\\Programing\\Java-Github\\Java-Advanced\\Advanced-2024\\src\\StreamsFilesAndDirectoriesExercises\\output6.txt";


        try (BufferedReader reader1 = Files.newBufferedReader(Path.of(inputOne));
             BufferedReader reader2 = Files.newBufferedReader(Path.of(inputTwo));
             BufferedWriter writer = Files.newBufferedWriter(Path.of(outputPath))
        ) {
            String line = reader1.readLine();
            while (line != null) {
                writer.write(line);
                writer.newLine();
                line = reader1.readLine();
            }

            line = reader2.readLine();
            while (line != null) {
                writer.write(line);
                writer.newLine();
                line = reader2.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
