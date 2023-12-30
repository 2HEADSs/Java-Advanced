package StreamsFilesandDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class WritetoFile {
    public static void main(String[] args) throws IOException {
        String path = "src/StreamsFilesandDirectories/input.txt";

        Set<Character> punctuations = Set.of(',', '.', '!', '?');

        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("write-to-file-output-txt");

        int oneByte = inputStream.read();

        while (oneByte >= 0) {
            char symbol = (char) oneByte;
            if (!punctuations.contains(symbol)) {
                outputStream.write(symbol);
            }
            oneByte = inputStream.read();
        }

    }
}
