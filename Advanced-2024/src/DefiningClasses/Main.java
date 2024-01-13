package DefiningClasses;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.brand = "Chevrolet";
        car.model = "Impala";
        car.horsePower = 390;

        System.out.printf("The car is: %s %s - %d HP",
                car.brand, car.model, car.horsePower);
    }
}
