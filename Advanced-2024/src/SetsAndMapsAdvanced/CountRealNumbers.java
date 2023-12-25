package SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        LinkedHashMap<Double, Integer> mapOfNums = new LinkedHashMap<>();

        for (double num : nums) {
            if (!mapOfNums.containsKey(num)) {
                mapOfNums.put(num, 1);
            } else {
                mapOfNums.put(num, mapOfNums.get(num) + 1);
            }
        }

        for (double key : mapOfNums.keySet()) {

            System.out.printf("%.1f -> %d%n", key, mapOfNums.get(key));
        }
    }
}
