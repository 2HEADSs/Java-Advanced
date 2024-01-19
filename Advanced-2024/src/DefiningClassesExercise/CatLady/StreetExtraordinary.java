package DefiningClassesExercise.CatLady;

public class StreetExtraordinary extends Cat{
    private double decibel;
    public StreetExtraordinary(String name, String breed, double decibel) {
        super(name, breed);
        this.decibel = decibel;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f", super.toString(), this.decibel);

    }
}
