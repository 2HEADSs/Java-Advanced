package StreamsFilesandDirectories;

import java.io.*;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws IOException {

        String path = "src/StreamsFilesandDirectories/input.txt";
        PrintWriter printer = new PrintWriter(new FileOutputStream("04-extract-and-write.txt"));
        Scanner scanner = new Scanner(new FileInputStream(path));

        while (scanner.hasNext()){
            if(scanner.hasNextInt()){
                printer.println(scanner.next());
            }
            scanner.next();
        }

        printer.close();
    }
}
