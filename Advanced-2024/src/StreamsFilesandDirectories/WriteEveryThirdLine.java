package StreamsFilesandDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String path = "src/StreamsFilesandDirectories/input.txt";
        PrintWriter printer = new PrintWriter(new FileOutputStream("05-write-every-thitd-line.txt"));
        Scanner scanner = new Scanner(new FileInputStream(path));

        int count = 0;
        while (scanner.hasNextLine()) {
            count++;
            if (count % 3 == 0) {
                printer.println(scanner.nextLine());

            }else {
                scanner.nextLine();
            }
        }

        printer.close();
    }
}
