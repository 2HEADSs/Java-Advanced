package SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> parking = new LinkedHashSet<>();
        String input = scanner.nextLine();

        while (!"END".equals(input)) {
            String[] commands = input.split(", ");
            if (commands[0].equals("IN")) {
                parking.add(commands[1]);
            } else {
                parking.remove(commands[1]);
            }
            input = scanner.nextLine();
        }
        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {

            for (String car : parking) {
                System.out.println(car);
            }
        }
    }


}
