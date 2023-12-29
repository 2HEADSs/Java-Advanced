package SetsAndMapsAdvancedExercise;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PopulationCounter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Map<String, Long>> countries = new LinkedHashMap<>();
        Map<String, Long> countriesTotalCount = new LinkedHashMap<>();
        while (!"report".equals(input)) {
            String[] tokens = input.split("\\|");
            String city = tokens[0];
            String country = tokens[1];
            long population = Long.parseLong(tokens[2]);

            countries.putIfAbsent(country, new LinkedHashMap<>());
            countriesTotalCount.putIfAbsent(country, 0L);

            countries.get(country).put(city, population);

            long populationOfCountry = countriesTotalCount.get(country) + population;
            countriesTotalCount.put(country, populationOfCountry);
            input = scanner.nextLine();
        }


        countriesTotalCount.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> {
                    Map<String, Long> cities = countries.get(entry.getKey());
                    System.out.printf("%s (total population: %d)\n",entry.getKey(),entry.getValue());
                    cities.entrySet()
                            .stream()
                            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                            .forEach(innerMapEntry -> {
                                System.out.printf("=>%s: %d\n", innerMapEntry.getKey(),innerMapEntry.getValue());
                            });
                });
    }
}
