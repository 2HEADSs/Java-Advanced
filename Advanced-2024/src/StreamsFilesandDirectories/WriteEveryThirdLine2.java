package StreamsFilesandDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class WriteEveryThirdLine2 {
    public static void main(String[] args) throws IOException {

        String path = "src/StreamsFilesandDirectories/input.txt";
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));

        String line = reader.readLine();
        int counter = 1;

        List<String> lines = new ArrayList<>();

        while (line != null) {

            if (counter % 3 == 0) {
                lines.add(line);

            }
            counter++;
            line = reader.readLine();
        }

        Path pathObj = Paths.get("05-write-every-thitd-line2.txt");
        Files.write(pathObj, lines);
    }
}
