package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseandExclude2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int divisible = Integer.parseInt(scanner.nextLine());
        Predicate<Integer> isDivisible = number -> number % divisible == 0;
        nums.removeIf(isDivisible);

        Collections.reverse(nums);
        Consumer<List<Integer>> reverseAndPrint = (arr) ->
                arr.forEach(s -> System.out.print(s + " "));

        reverseAndPrint.accept(nums);

    }
}
