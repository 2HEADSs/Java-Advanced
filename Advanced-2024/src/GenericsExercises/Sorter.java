package GenericsExercises;

public class Sorter {
    private Sorter() {

    }

    public static <T extends Comparable<T>> void sort(CustomList<T> customList) {

        for (int i = 0; i < customList.getSize(); i++) {
            T currentElement = customList.get(i);
            for (int j = i + 1; j < customList.getSize(); j++) {
                if (currentElement.compareTo(customList.get(j)) > 0) {
                    customList.swap(i,j);
                }
            }
        }
    }
}
