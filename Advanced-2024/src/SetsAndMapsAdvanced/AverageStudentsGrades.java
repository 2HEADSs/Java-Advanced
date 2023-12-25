package SetsAndMapsAdvanced;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, List<Double>> data = new TreeMap<>();


        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String keyName = input[0];
            double grade = Double.parseDouble(input[1]);

            if (!data.containsKey(keyName)) {
                List<Double> currentList = new ArrayList<>();
                currentList.add(grade);
                data.put(keyName, currentList);
            } else {
                List<Double> currentList = data.get(keyName);
                currentList.add(grade);
                data.put(keyName, currentList);
            }
        }

        for (String key : data.keySet()) {
            List<Double> personGrades = data.get(key);
            double sum = personGrades.stream().mapToDouble(f -> f).sum();
            double average = sum/personGrades.size();
            System.out.print(key + " -> ");
            for (double gr :personGrades){
                System.out.printf("%.2f ",gr);
            }
            System.out.printf("(avg: %.2f)%n",average);
        }
    }
}
