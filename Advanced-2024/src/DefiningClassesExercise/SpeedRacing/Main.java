package DefiningClassesExercise.SpeedRacing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Car> cars = new LinkedHashMap<>();
        String commandsLine = scanner.nextLine();
        while (n-- > 0) {
            String[] tokens = commandsLine.split("\\s+");
            String model = tokens[0];
            double fuelAmount = Double.parseDouble(tokens[1]);
            double fuelConsume = Double.parseDouble(tokens[2]);
            Car car = new Car(model, fuelAmount, fuelConsume);
            cars.putIfAbsent(model, car);

            commandsLine = scanner.nextLine();
        }

        while (!commandsLine.equals("End")) {
            String[] tokens = commandsLine.split("\\s+");
            String currentModel = tokens[1];
            Car currentCar = cars.get(currentModel);
            boolean canDrive = currentCar.tryToDrive(Integer.parseInt(tokens[2]));

            if (!canDrive) {
                System.out.println("Insufficient fuel for the drive");
            }
            commandsLine = scanner.nextLine();
        }

        cars.forEach((key, value) -> System.out.printf("%s %.2f %d%n", key, value.getFuelAmount(), value.getDistance()));
    }
}
