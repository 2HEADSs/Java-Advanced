package SetsAndMapsAdvancedExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> emails = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while (!"stop".equals(line)) {
            String name = line;
            String email = scanner.nextLine();
            if (!email.endsWith(".us") && !email.endsWith(".uk") && !email.endsWith(".com")) {
                emails.put(name, email);
            }

            line = scanner.nextLine();
        }


        emails.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
