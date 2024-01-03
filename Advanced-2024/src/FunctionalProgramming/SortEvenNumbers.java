package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String separator = ", ";
        int[] input = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        List<Integer> evenNums = new ArrayList<>();

        Arrays.stream(input).filter(n -> n % 2 == 0)
                .forEach(n -> {
                    System.out.print(n + separator);

                    evenNums.add(n);
                });
        System.out.println();
        evenNums.stream().sorted(Integer::compare)
                .forEach(System.out::print);
    }
}
