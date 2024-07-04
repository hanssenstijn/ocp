package org.example.ch10;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Streamz {
    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();
        Stream<Integer> singElement = Stream.of(1);
        Stream<Integer> ffromArray = Stream.of(1, 2, 3);

        var list = List.of("a", "b", "c");
        Stream<String> fromList = list.stream();
        Stream<String> fromListParallel = list.parallelStream();

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println("s.count() : " + s.count());

        Stream<String> s3 = Stream.of("monkey", "gorilla", "bonobo");
        Optional<String> min = s3.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println);

        Stream<String> infinite = Stream.generate(() -> "chimp");
        infinite.findAny().ifPresent(System.out::println);

        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println("list.stream().anyMatch(pred) : " + list.stream().anyMatch(pred));
        System.out.println("list.stream().allMatch(pred) : " + list.stream().allMatch(pred));
        System.out.println("list.stream().noneMatch(pred) : " + list.stream().noneMatch(pred));

        Stream<String> s4 = Stream.of("monkey", "gorilla", "bonobo");
        s4.forEach(System.out::println);

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (z, c) -> z + c);
        System.out.println(word);

        Stream<Integer> stream2 = Stream.of(3, 5, 6);
        System.out.println("stream2.reduce(1, (a, b) -> a * b) : " + stream2.reduce(1, (a, b) -> a * b));

        Stream<String> s5 = Stream.of("monkey", "gorilla", "bonobo");
        s5.filter(x -> x.startsWith("g")).forEach(System.out::println);

        Stream<String> s6 = Stream.of("duck","duck","duck","goose");
        s6.distinct().forEach(System.out::println);

        Stream<String> s7 = Stream.of("monkey", "gorilla", "bonobo");
        s7.map(String::length).forEach(System.out::println);

        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero,one,two);
        animals.flatMap(m -> m.stream()).forEach(System.out::println);

        Stream<String> s8 = Stream.of("duck","duck","duck","goose");
        Stream<String> s9 = Stream.of("monkey", "gorilla", "bonobo");

        Stream.concat(s8,s9).forEach(System.out::println);

        Stream<String> s10 = Stream.of("brown-","bear-");
        s10.sorted().forEach(System.out::println);

        Stream<String> s11 = Stream.of("brown-","bear-","grizzly-");
        s11.sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }
}
