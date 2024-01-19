package DefiningClassesExercise.CatLady;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Cat> cats = new HashMap<>();

        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            String type = tokens[0];
            String name = tokens[1];
            double catParameter = Double.parseDouble(tokens[2]);
            Cat cat = null;
            switch (type) {
                case "StreetExtraordinaire":
                    cat = new StreetExtraordinary(name, type, catParameter);
                    break;
                case "Siamese":
                    cat = new Siamese(name, type, catParameter);
                    break;
                case "Cymric":
                    cat = new Cymric(name, type, catParameter);
                    break;
            }
            cats.put(name, cat);
            input = scanner.nextLine();
        }

        String name = scanner.nextLine();
        Cat currentCat = cats.get(name);
        System.out.println(currentCat.toString());

    }
}
