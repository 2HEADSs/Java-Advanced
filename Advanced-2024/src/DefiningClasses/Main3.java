package DefiningClasses;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car2> car2s = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String brand = tokens[0];
            Car2 car2;

            if (tokens.length == 1) {
                car2 = new Car2(brand);
            } else {
                String model = tokens[1];
                int horsePower = Integer.parseInt(tokens[2]);
                car2 = new Car2(brand, model, horsePower);
            }
            car2s.add(car2);
        }

        car2s.forEach(System.out::println);

    }
}
