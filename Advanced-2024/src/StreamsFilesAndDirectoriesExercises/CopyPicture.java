package StreamsFilesAndDirectoriesExercises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPicture {
    public static void main(String[] args) {

        String inputPath = "C:\\Programing\\Java-Github\\Java-Advanced\\Advanced-2024\\src\\StreamsFilesAndDirectoriesExercises\\pic.jpg";
        String outputPath = "C:\\Programing\\Java-Github\\Java-Advanced\\Advanced-2024\\src\\StreamsFilesAndDirectoriesExercises\\picture-copy.jpg";

        try (FileInputStream fileInputStream = new FileInputStream(inputPath);
             FileOutputStream fileOutputStream = new FileOutputStream(outputPath)) {

            int oneByte = fileInputStream.read();
            while (oneByte !=-1){
                fileOutputStream.write(oneByte);
                oneByte = fileInputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
