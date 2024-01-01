package StreamsFilesAndDirectoriesExercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) {
        String path = "C:\\Programing\\Java-Github\\Java-Advanced\\Advanced-2024\\src\\StreamsFilesAndDirectoriesExercises\\input.txt";


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            long sum = 0;

            while (line != null) {
                for (char c : line.toCharArray()) {
                    sum += c;
                }
                line = bufferedReader.readLine();
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
