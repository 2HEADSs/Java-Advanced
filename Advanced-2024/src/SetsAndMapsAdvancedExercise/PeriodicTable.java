package SetsAndMapsAdvancedExercise;

import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        TreeSet<String> elements = new TreeSet<>();

        while (count-- > 0) {
            String[] commands = scanner.nextLine().split("\\s+");
            for (int i = 0; i < commands.length; i++) {
                elements.add(commands[i]);
            }
        }

        for (String el : elements) {
            System.out.print(el + " ");
        }
    }
}
