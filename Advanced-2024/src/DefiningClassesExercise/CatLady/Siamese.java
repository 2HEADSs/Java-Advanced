package DefiningClassesExercise.CatLady;

public class Siamese extends Cat {
    private double earSize;
    public Siamese(String name, String breed, double earSize) {
        super(name, breed);
        this.earSize = earSize;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f", super.toString(), this.earSize);

    }
}
