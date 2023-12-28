package MultidimensionalArraysExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<String> usernames = new LinkedHashSet<>();

        int count = Integer.parseInt(scanner.nextLine());

        while (count-- > 0) {
            usernames.add(scanner.nextLine());
        }

        for (String name: usernames){
        System.out.println(name);

        }
    }
}
