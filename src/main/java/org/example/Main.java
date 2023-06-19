package org.example;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = -12;

        Double d = 15.58;
        Double s = 49.24;

        String name1 = "Pol";
        String name2 = "Pit";

        // задание 1
        Predicate<Integer> predicate = new Predicate<>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };

        System.out.println("Анонимный класс: " + predicate.test(a));

        Predicate<Integer> predicate1 = integer -> integer > 0;

        System.out.println("Лямбда-выражение: " + predicate1.test(b));


        // задание 2
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("Анонимный класс: Привет " + name);
            }
        };
        consumer.accept(name1);

        Consumer<String> consumer1 = name -> System.out.println("Лямбда-выражение: Привет " + name);
        consumer1.accept(name2);


        // задание 3
        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double person) {
                return person.longValue();
            }
        };

        System.out.println("Анонимный класс: " + function.apply(d));


        Function<Double, Long> function1 = Double::longValue;

        System.out.println("Лямбда-выражение: " + function1.apply(s));

        // задание 4
        Supplier<Long> supplier = new Supplier<Long>() {
            @Override
            public Long get() {
                return Math.round(random()*100);
            }
        };

        System.out.println("Анонимный класс: Random - " + supplier.get());

        Supplier<Long> supplier1 = () -> Math.round(random()*100);

        System.out.println("Лямбда-выражение: Random - " + supplier1.get());
    }
}