package Homework;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<PersonService> persons = List.of(
                new PersonService("Andrei", "Matinca", 17, "Cluj"),
                new PersonService("Cosmin", "Baciu", 15, "Oradea"),
                new PersonService("Marcel", "Morosan", 45, "Cluj"),
                new PersonService("Richard", "Moldovan", 18, "Oradea"),
                new PersonService("David", "Pandor", 35, "Suceava"),
                new PersonService("Alex", "Costineanu", 70, "Bucuresti"),
                new PersonService("Bogdan", "Macovei", 28, "Oradea"),
                new PersonService("Bogdan", "Macovei", 28, "Cluj")
        );

        List<String> fullName =persons.stream().map(personService -> personService.getFirstName() + " " + personService.getLastName()).toList();
        System.out.println(fullName);

        List<PersonService> major = persons.stream().filter(personService -> personService.getAge() >= 18).toList();
        System.out.println(major);

        List<PersonService> oradea = persons.stream().filter(person -> person.getCity().equals("Oradea")).toList();
        System.out.println(oradea);

        List<String> toUpperCase = persons.stream().map(person -> person.getFirstName().toUpperCase()).toList();
        System.out.println(toUpperCase);

        List<String> charLastName = persons.stream().map(person -> person.getFirstName() + " " + person.getLastName().charAt(0)).toList();
        System.out.println(charLastName);

        List<PersonService> age = persons.stream().filter(person -> person.getAge() > 18 && person.getAge() < 65).toList();
        System.out.println(age);

        List<PersonService> startingWith = persons.stream().filter(person -> person.getFirstName().startsWith("A")).toList();
        System.out.println(startingWith);

        List<String> distinct = persons.stream().map(PersonService::getFirstName).distinct().toList();
        System.out.println(distinct);


        List<String> sortedFirst = persons.stream().map(PersonService::getFirstName).sorted().toList();
        System.out.println(sortedFirst);

        List<String> sortedLast = persons.stream().map(PersonService::getLastName).sorted().toList();
        System.out.println(sortedLast);

        List<PersonService> fullSort = persons.stream()
                .sorted(Comparator.comparing(PersonService::getFirstName)
                        .thenComparing(PersonService::getLastName)
                        .thenComparing(PersonService::getAge)).toList();
        System.out.println(fullSort);

    }


}
