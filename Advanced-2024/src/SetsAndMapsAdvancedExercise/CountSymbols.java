package SetsAndMapsAdvancedExercise;

import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> container = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            String el = String.valueOf(input.charAt(i));

            if (!container.containsKey(el)) {
                container.put(el, 1);
            } else {
                int count = container.get(el);
                container.put(el, ++count);
            }

        }
        for (String s : container.keySet()) {
            System.out.println(s + ": " + container.get(s) +" time/s");
        }
    }
}
