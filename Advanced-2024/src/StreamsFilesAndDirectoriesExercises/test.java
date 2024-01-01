package StreamsFilesAndDirectoriesExercises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class test {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Programing\\Java-Github\\Java-Advanced\\Advanced-2024\\src\\StreamsFilesAndDirectoriesExercises\\test.txt";
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            int oneByte = fileInputStream.read();
            while (oneByte != -1) {
                System.out.println(oneByte);
                System.out.println(Integer.toBinaryString(oneByte));
                oneByte = fileInputStream.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            fileInputStream.close();
        }
        System.out.println("Empty line between methods");
        try (FileReader fileReader = new FileReader(path)) {

            int asciCode = fileReader.read();
            while (asciCode != -1) {
                System.out.println(asciCode + " ASCII code");
                System.out.println((char) asciCode + " As real char");
                asciCode = fileReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
