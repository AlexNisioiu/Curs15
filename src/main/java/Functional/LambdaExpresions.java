package Functional;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExpresions {
    public static void main(String[] args) {
        tryFunction(a -> a + 1);
        tryFunction(a -> a * 2);
        tryFunction(a -> {
            Random random = new Random();
            int randomNumber = random.nextInt(100);
            return a + randomNumber;
        });

        tryConsumer((s) -> System.out.println(s));
        tryConsumer(System.out::println);
        tryConsumer(s -> System.out.println(s.toUpperCase()));
        tryConsumer(s -> s.toLowerCase());
        tryConsumer(String::toLowerCase);

        tryPredicate(i -> i < 10);
        tryPredicate(i -> i % 2 == 0);

    }

    public static void tryPredicate(Predicate<Integer> tester) {
//        100 lines of code
        int a = 10;
        if (tester.test(a)) {
            System.out.println("WON");
        } else {
            System.out.println("LOST");
        }

//        100 lines of code
    }

    public static void tryFunction(Function<Integer, Integer> operation) {
//         100 de linii de cod
        int i = 4;
        System.out.println(operation.apply(i));
//         100 de linii de cod
    }

    public static void tryConsumer(Consumer<String> consumer) {
//        100 lines of code
        String s = "test";
        consumer.accept(s);
//        100 lines of code
    }
}
