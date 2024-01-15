package DefiningClassesExercise.RawData;

public class Tire {

    private double pressure;
    private int age;

    public Tire( double pressure,int age) {
        this.pressure = pressure;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public double getPressure() {
        return pressure;
    }

}
