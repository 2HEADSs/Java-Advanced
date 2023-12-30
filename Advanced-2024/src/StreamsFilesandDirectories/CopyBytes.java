package StreamsFilesandDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        String path = "src/StreamsFilesandDirectories/input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("copy-bytes.txt");

        int oneByte = inputStream.read();

        while (oneByte != -1) {

            if (oneByte == 32) {
                outputStream.write(' ');
            } else if (oneByte == 10) {
                outputStream.write('\n');
            } else  {
                String message = String.valueOf(oneByte);
                for (char c : message.toCharArray())
                    outputStream.write(c);
            }
            oneByte = inputStream.read();
        }
    }
}
