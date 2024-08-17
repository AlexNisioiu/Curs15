package Functional;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercise {
    public static void main(String[] args) {
        List<Citizen> citizens = List.of(
                new Citizen("Mike", 28, "Student", false),
                new Citizen("Amanda", 35, "Artist", true),
                new Citizen("Nick", 24, "Designer", true),
                new Citizen("Pete", 45, "Artist", false)

        );

        List<Citizen> result = citizens.stream().filter(citizen -> citizen.age() > 40).toList();
        System.out.println(result);

        List<String> names = citizens.stream().map(Citizen::name).toList();
        System.out.println(names);

//        List<Citizen> skip = citizens.stream().skip(2).toList();
//        System.out.println(skip);
//
//        List<Citizen> limit = citizens.stream().limit(2).toList();
//        System.out.println(limit);
//
//        List<Citizen> distinct = citizens.stream().distinct().toList();
//        System.out.println(distinct);

        System.out.println(citizens.stream().filter(Citizen::married).count());

        System.out.println(citizens.stream().allMatch(citizen -> citizen.profession().equals("Artist")));
        System.out.println(citizens.stream().anyMatch(citizen -> citizen.profession().equals("Artist")));
//
//        System.out.println(citizens.stream().findFirst());
//        System.out.println(citizens.stream().findAny());

        System.out.println(citizens.stream().mapToInt(Citizen::age).average().orElse(0));


        System.out.println(citizens.stream().map(Citizen::profession).reduce((accumulator, iterator) -> accumulator + " " + iterator));

        System.out.println(citizens.stream().sorted(Comparator.comparingInt(Citizen::age).reversed()).toList());

        System.out.println(citizens
                .stream()
                .sorted(Comparator.comparing(Citizen::profession).thenComparingInt(citizen -> -citizen.age()))
                .toList());

        Stream<String> stringStream = citizens.stream().map(citizen -> {
            System.out.println(citizen.name());
            return citizen.name();
        });
        System.out.println("After intermediate and before final operation");
        System.out.println(stringStream.toList());

    }


}

record Citizen(String name, int age, String profession, boolean married) {

}
