package DefiningClassesExercise.SpeedRacing;

public class Car {

    private String model;
    private double fuelAmount;

    private double fuelCost;

    private int distance;


    public Car(String model, double fuelAmount, double fuelCost) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCost = fuelCost;
    }

    public String getModel() {
        return model;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getFuelCost() {
        return fuelCost;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setFuel(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getDistance() {
        return this.distance;
    }
    public void sumDistance(int km){
        setDistance(km + getDistance());
    }

    public void setFuelCost(double fuelCost) {
        this.fuelCost = fuelCost;
    }

    public boolean tryToDrive(int km) {

        double leftAmount = (this.getFuelAmount() - (this.getFuelCost() * km));
        if (leftAmount >= 0) {
            this.setFuel(leftAmount);
            sumDistance(km);
            return true;
        } else {
            return false;
        }
    }
}
