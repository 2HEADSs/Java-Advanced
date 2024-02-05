package IteratorsandComparatorsExercise.listy_iterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        ListyIterator<String> listyIterator = new ListyIterator<>();

        while (!"END".equals(line)) {
            String[] tokens = line.split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "Create":
//                    String[] elements = new String[tokens.length - 1];
//                    for (int i = 1; i < tokens.length; i++) {
//                        elements[i - 1] = tokens[i];
//                    }
//                    System.arraycopy(tokens, 1, elements, 0, tokens.length - 1);
                    String[] elements = Arrays.stream(tokens).skip(1).toArray(String[]::new);
                    listyIterator = new ListyIterator<>(elements);
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    try {
                        listyIterator.print();
                    } catch (IllegalStateException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "PrintAll":
                    listyIterator.forEach(el -> System.out.print(el + " "));
                    System.out.println();
                    break;
            }
            line = scanner.nextLine();
        }
    }
}
