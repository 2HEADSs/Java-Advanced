package DefiningClasses;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();


        =car.setBrand("Chevrolet");
        car.setModel("Impala");
        car.setHorsePower(390);

        System.out.printf("The car is: %s %s - %d HP",
                car.brand, car.model, car.horsePower);
    }
}
