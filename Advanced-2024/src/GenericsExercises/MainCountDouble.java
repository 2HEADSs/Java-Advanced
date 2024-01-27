package GenericsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCountDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Box<Double>> boxList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            Box<Double> box = new Box<>(Double.parseDouble(scanner.nextLine()));
            boxList.add(box);
        }
        Box<Double> stringBox = new Box<>(Double.parseDouble(scanner.nextLine()));
        Double output = countGreaterElements(boxList, stringBox);
        System.out.printf("%.0f\n",output);
    }

    static <T extends Comparable<T>> double countGreaterElements(List<T> data, T element) {
        int count = 0;

        for (T e : data) {
            int res = e.compareTo(element);
            if (res > 0) {
                count++;
            }
        }
        return count;
    }

    static <T> void swap(List<T> boxList, int firstIndex, int secondIndex) {
        T firstElement = boxList.get(firstIndex);
        T secondElement = boxList.get(secondIndex);
        boxList.set(firstIndex, secondElement);
        boxList.set(secondIndex, firstElement);
    }
}
