package StreamsFilesandDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile2 {
    public static void main(String[] args) throws IOException {
        String path = "src/StreamsFilesandDirectories/input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        int oneByte = inputStream.read();

        while (oneByte >= 0) {
            System.out.print(Integer.toBinaryString(oneByte) + " ");
            oneByte = inputStream.read();
        }

    }
}
