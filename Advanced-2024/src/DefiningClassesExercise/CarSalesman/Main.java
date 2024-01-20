package DefiningClassesExercise.CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enginesCount = Integer.parseInt(scanner.nextLine());

        Map<String, Engine> engines = new HashMap<>();

        while (enginesCount-- > 0) {
            String[] engineData = scanner.nextLine().split("\\s+");
            String engineModel = engineData[0];
            int enginePower = Integer.parseInt(engineData[1]);
            int engineDisplacement = 0;
            String engineEfficiency = "n/a";

            if (engineData.length > 2) {
                if (Character.isDigit(engineData[2].charAt(0))) {
                    engineDisplacement = Integer.parseInt(engineData[2]);
                } else {
                    engineEfficiency = engineData[2];
                }
            }
            if (engineData.length > 3) {
                engineEfficiency = engineData[3];
            }
            Engine engine = new Engine(engineModel, enginePower, engineDisplacement, engineEfficiency);
            engines.put(engineModel, engine);
        }

        int carsCount = Integer.parseInt(scanner.nextLine());

        Set<Car> cars = new LinkedHashSet<>();

        while (carsCount-- > 0) {
            String[] carData = scanner.nextLine().split("\\s+");
            String model = carData[0];
            Engine engine = engines.get(carData[1]);

            int weight = 0;
            String color = "n/a";

            if (carData.length > 2) {
                if (Character.isDigit(carData[2].charAt(0))) {
                    weight = Integer.parseInt(carData[2]);
                } else {
                    color = carData[2];
                }
            }
            if (carData.length > 3) {
                color = carData[3];
            }

            Car car = new Car(model, engine, weight, color);
            cars.add(car);
        }

        for (Car car : cars) {
            Engine engine = car.getEngine();
            System.out.println(car.toString());


        }
    }
}
