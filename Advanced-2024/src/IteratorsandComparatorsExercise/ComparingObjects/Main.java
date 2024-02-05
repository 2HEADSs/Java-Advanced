package IteratorsandComparatorsExercise.ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> persons = new ArrayList<>();
        String line = scanner.nextLine();
        while (!"END".equals(line)) {
            String[] tokens = line.split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String town = tokens[2];
            Person person = new Person(name, age, town);
            persons.add(person);
            line = scanner.nextLine();
        }
        int equals = 1;
        int notEqual = 0;
        int totalPeople = persons.size();
        int indexOfPerson = Integer.parseInt(scanner.nextLine()) - 1;
        Person current = persons.get(indexOfPerson);
        for (int i = 0; i < persons.size(); i++) {
            if (i == indexOfPerson) {
                continue;
            }
            int result = persons.get(i).compareTo(current);
            if (result == 0) {
                equals++;
            } else {
                notEqual++;
            }
        }
        if (equals == 1) {
            System.out.println("No matches");
        } else {
            System.out.println(equals + " " + notEqual + " " + totalPeople);

        }
    }
}
