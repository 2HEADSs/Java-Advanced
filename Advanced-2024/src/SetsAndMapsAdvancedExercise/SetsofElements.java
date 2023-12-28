package SetsAndMapsAdvancedExercise;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class SetsofElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> firstNums = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondNums = new LinkedHashSet<>();
        LinkedHashSet<Integer> reapeatableNums = new LinkedHashSet<>();

        String[] inputNums = scanner.nextLine().split("\\s+");
        int firstCount = Integer.parseInt(inputNums[0]);
        int secondCount = Integer.parseInt(inputNums[1]);

        while (firstCount-- > 0) {
            int input = Integer.parseInt(scanner.nextLine());
            firstNums.add(input);
        }
        while (secondCount-- > 0) {
            int input = Integer.parseInt(scanner.nextLine());
            if (firstNums.contains(input)) {
                reapeatableNums.add(input);
            }
            secondNums.add(input);

        }

        for (int e : reapeatableNums) {
            System.out.print(e + " ");
        }

    }
}
