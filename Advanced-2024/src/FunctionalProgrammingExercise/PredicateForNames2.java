package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());


        Predicate<String> checkLength = string -> string.length() <= length;

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(checkLength)
                .forEach(System.out::println);
    }
}
