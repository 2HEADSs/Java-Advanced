package SetsAndMapsAdvancedExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTableWithStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        TreeSet<String> elements = new TreeSet<>();
        for (int i = 0; i < count; i++) {
        elements.addAll(Arrays.asList(scanner.nextLine().split("\\s+")));

        }

        for (String el : elements) {
            System.out.print(el + " ");
        }
    }
}
