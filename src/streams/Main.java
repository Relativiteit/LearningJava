package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        List<Person> people = getPeople();
    /*
        // Imperative approach
        List<Person> females = new ArrayList<>();
        // for each person from class Person in list people
        for (Person person : people) {
            if (person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }

        females.forEach(System.out::println);
        */

        // Declarative approach using Streams API

        // Filter
        List<Person> females = people.stream()  //Extract variable with ctrl + alt + V
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());      // collect the list
//        females.forEach(System.out::println); // ctrl + slash to comment line

        // Sort sorts the people on age
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed())
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);
        // All match
        // Any match
        // None match
        // Max
        // Min
        // Group
        // constructor
    }
    private static List<Person> getPeople() {
        return List.of(
                new Person("James Bond", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White" , 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.MALE)
        );
    }
}
