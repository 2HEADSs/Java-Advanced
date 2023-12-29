package SetsAndMapsAdvancedExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new HashMap<>();

        String line = scanner.nextLine();
        while (!"search".equals(line)) {
            String[] commands = line.split("-");
            String name = commands[0];
            String number = commands[1];

            phonebook.put(name, number);
            line = scanner.nextLine();
        }
        String searchName = scanner.nextLine();
        while (!"stop".equals(searchName)) {
            if (phonebook.containsKey(searchName)) {
                System.out.println(searchName + " -> " + phonebook.get(searchName));
            } else {
                System.out.printf("Contact %s does not exist.\n", searchName);
            }
        searchName = scanner.nextLine();
        }

    }
}
