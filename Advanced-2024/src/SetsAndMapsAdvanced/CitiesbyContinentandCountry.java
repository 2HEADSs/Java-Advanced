package SetsAndMapsAdvanced;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class CitiesbyContinentandCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, LinkedHashMap<String, List<String>>>
                countriesByContinent = new LinkedHashMap<>();


        while (n-- > 0) {
            String[] inputs = scanner.nextLine().split("\\s+");

            String continent = inputs[0];
            String country = inputs[1];
            String city = inputs[2];

            countriesByContinent.putIfAbsent(continent, new LinkedHashMap<>());
            LinkedHashMap<String, List<String>> citiesByCountry =
                    countriesByContinent.get(continent);

            citiesByCountry.putIfAbsent(country, new ArrayList<>());
            List<String> cities = citiesByCountry.get(country);
            cities.add(city);
        }

        countriesByContinent.forEach((key, value) -> {
            System.out.println(key + ":");

            value.forEach((key1, value1) -> {
                String cities = String.join(", ", value1);
                System.out.println("  " + key1 + " -> " + cities);
            });
        });

    }
}
