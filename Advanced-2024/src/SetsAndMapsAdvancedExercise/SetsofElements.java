package SetsAndMapsAdvancedExercise;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class SetsofElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> firstSet = new LinkedHashSet<>();
        LinkedHashSet<String> secondSet = new LinkedHashSet<>();

        String[] inputNums = scanner.nextLine().split("\\s+");
        int firstCount = Integer.parseInt(inputNums[0]);
        int secondCount = Integer.parseInt(inputNums[1]);

        while (firstCount-- > 0) {
            firstSet.add(scanner.nextLine());
        }

        while (secondCount-- > 0) {
            secondSet.add(scanner.nextLine());
        }

        firstSet.retainAll(secondSet);

        String result = String.join("",firstSet);
        System.out.println(result);


    }
}
