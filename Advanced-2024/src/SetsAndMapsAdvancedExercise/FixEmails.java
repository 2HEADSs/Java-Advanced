package SetsAndMapsAdvancedExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> emails = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while (!"stop".equals(line)) {
            String name = line;
            String email = scanner.nextLine();
            String[] emailOnParts = email.split("\\.");
            String domain = emailOnParts[emailOnParts.length - 1];

            if (!domain.equals("us")
                    && !domain.equals("uk")
                    && !domain.equals("com")) {
                emails.put(name, email);
            }

            line = scanner.nextLine();
        }

        
        emails.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
