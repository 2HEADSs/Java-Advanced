package DefiningClassesExercise.RawData;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;

    private Engine engine;

    private Cargo cargo;

    private List<Tire> tires;

    public Car(String model, int enginSpeed, int enginePower,
               int cargoWeight, String cargoType,
               double tire1pressure, int tire1age,
               double tire2pressure, int tire2age,
               double tire3pressure, int tire3age,
               double tire4pressure, int tire4age
    ) {
        this.model = model;
        this.engine = new Engine(enginSpeed, enginePower);
        this.cargo = new Cargo(cargoWeight, cargoType);
        this.tires = new ArrayList<>();
        tires.add(new Tire(tire1pressure, tire1age));
        tires.add(new Tire(tire2pressure, tire2age));
        tires.add(new Tire(tire3pressure, tire3age));
        tires.add(new Tire(tire4pressure, tire4age));

    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public List<Tire> getTires() {
        return tires;
    }
}

