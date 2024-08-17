package Homework;

import java.io.FilterOutputStream;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonService {

    public static void main(String[] args) {

        List<Person> persons = List.of(
                new Person("Andrei", "Matinca", 17, "Cluj"),
                new Person("Cosmin", "Baciu", 15, "Oradea"),
                new Person("Marcel", "Morosan", 45, "Cluj"),
                new Person("Richard", "Moldovan", 18, "Oradea"),
                new Person("David", "Pandor", 35, "Suceava"),
                new Person("Alex", "Costineanu", 70, "Bucuresti"),
                new Person("Bogdan", "Macovei", 28, "Cluj"),
                new Person("Bogdan", "Macovei", 28, "Cluj")
        );

        List<String> fullName = persons.stream().map(person -> person.firstName() + " " + person.lastName()).toList();
        System.out.println(fullName);

        List<Person> major = persons.stream().filter(person -> person.age() >= 18).toList();
        System.out.println(major);

        List<Person> oradea = persons.stream().filter(person -> person.city().equals("Oradea")).toList();
        System.out.println(oradea);

        List<String> toUpperCase = persons.stream().map(person -> person.firstName().toUpperCase()).toList();
        System.out.println(toUpperCase);

        List<String> charLastName = persons.stream().map(person -> person.firstName() + " " + person.lastName().charAt(0)).toList();
        System.out.println(charLastName);

        List<Person> age = persons.stream().filter(person -> person.age() > 18 && person.age() < 65).toList();
        System.out.println(age);

        List<Person> startingWith = persons.stream().filter(person -> person.firstName().startsWith("A")).toList();
        System.out.println(startingWith);

        List<String> distinct = persons.stream().map(Person::firstName).distinct().toList();
        System.out.println(distinct);


        List<String> sortedFirst = persons.stream().map(Person::firstName).sorted().toList();
        System.out.println(sortedFirst);

        List<String> sortedLast = persons.stream().map(Person::lastName).sorted().toList();
        System.out.println(sortedLast);

        List<Person> fullSort = persons.stream()
                .sorted(Comparator.comparing(Person::firstName)
                        .thenComparing(Person::lastName)
                        .thenComparing(Person::age)).toList();
        System.out.println(fullSort);

    }


}
