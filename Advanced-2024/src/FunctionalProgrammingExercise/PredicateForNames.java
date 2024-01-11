package FunctionalProgrammingExercise;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());

        List<String> inputNames = new java.util.ArrayList<>(List.of(scanner.nextLine().split("\\s+")));

        Predicate<String> checkLength = string -> string.length() > length;

        inputNames.removeIf(checkLength);

        inputNames.forEach(s -> System.out.printf("%s%n", s));

    }
}
