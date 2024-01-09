package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsofHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> print = System.out::println;

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(s -> print.accept("Sir " + s));
    }
}
