package DefiningClassesExercise.CarSalesman;

public class Car {
    private String model;
    private Engine engine;

    private int weight;

    private String color;


    public Car(String model, Engine engine) {
        this(model, engine, 0, "n/a");
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine, weight, "n/a");
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine, 0, color);
    }


    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        String currentWeight = "n/a";
        if (getWeight() > 0) {
            currentWeight = String.valueOf(getWeight());
        }

        String currentDisplacement = "n/a";
        if (engine.getDisplacement() > 0) {
            currentDisplacement = String.valueOf(engine.getDisplacement());
        }

        return String.format("%s:%n%s:%nPower: %d%nDisplacement: %s%nEfficiency: %s%nWeight: %s%nColor: %s",
                getModel(), engine.getModel(), engine.getPower(), currentDisplacement,
                engine.getEfficiency(), currentWeight, getColor());
    }
}

