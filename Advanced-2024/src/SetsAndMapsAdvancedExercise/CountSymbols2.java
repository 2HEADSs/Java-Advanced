package SetsAndMapsAdvancedExercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> container = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            Character el = input.charAt(i);

            if (!container.containsKey(el)) {
                container.put(el, 1);
            } else {
                int count = container.get(el);
                container.put(el, ++count);
            }

        }
        container.forEach((key, value) -> System.out.printf("%c: %d time/s\n", key, value));
    }
}
