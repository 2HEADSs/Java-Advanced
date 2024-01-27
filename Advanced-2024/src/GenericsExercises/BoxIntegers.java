package GenericsExercises;

public class BoxIntegers<T> {
    private T data;

    public BoxIntegers(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",
                this.data.getClass().getName(), this.data);

    }
}
