package DefiningClassesExercise;

import java.util.*;

public class PersonMain {
    public static void main(String[] args) {
        Person person;
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            person = new Person(name, age);
            if (age > 30) {
                people.add(person);
            }
        }
        Collections.sort(people, new Person.PersonComparator());
        people.forEach(p -> System.out.println(p.name + " - " + p.years));
    }


}
