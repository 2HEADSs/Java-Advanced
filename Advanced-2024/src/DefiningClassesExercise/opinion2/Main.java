package DefiningClassesExercise.opinion2;

import DefiningClassesExercise.opinion2.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]));
            personList.add(person);
        }
        personList.stream().filter(person -> person.getAge() > 30)
                .sorted((a, b) -> a.getName().compareTo(b.getName()))
                .forEach(System.out::println);
    }
}
