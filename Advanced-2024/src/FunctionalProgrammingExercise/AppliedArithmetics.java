package FunctionalProgrammingExercise;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<Integer, Integer> add = (num) -> num + 1;
        Function<Integer, Integer> multiply = (num) -> num * 2;
        Function<Integer, Integer> subtract = (num) -> num - 1;
        Consumer<Integer> print = num -> System.out.print(num +" ");
        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            if (command.equals("add")) {
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = add.apply(nums[i]);
                }
            } else if (command.equals("multiply")) {
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = multiply.apply(nums[i]);
                }
            } else if (command.equals("subtract")) {
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = subtract.apply(nums[i]);
                }
            } else if (command.equals("print")) {
                for (int i = 0; i < nums.length; i++) {
                    print.accept(nums[i]);
                }
            }
            command = scanner.nextLine();
        }
    }
}
