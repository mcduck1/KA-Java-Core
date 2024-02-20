package jc_6;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ex_6_1_6 {
    public static void main(String[] args) {
        whenNamesPresentConsumeAll();
        }
    public static void whenNamesPresentConsumeAll() {
        Consumer<String> printConsumer = t -> System.out.println(t);
        Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");
        cities.forEach(printConsumer);
    }
}