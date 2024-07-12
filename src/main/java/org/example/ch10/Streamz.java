package org.example.ch10;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

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

        Stream<String> s6 = Stream.of("duck", "duck", "duck", "goose");
        s6.distinct().forEach(System.out::println);

        Stream<String> s7 = Stream.of("monkey", "gorilla", "bonobo");
        s7.map(String::length).forEach(System.out::println);

        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.flatMap(m -> m.stream()).forEach(System.out::println);

        Stream<String> s8 = Stream.of("duck", "duck", "duck", "goose");
        Stream<String> s9 = Stream.of("monkey", "gorilla", "bonobo");

        Stream.concat(s8, s9).forEach(System.out::println);

        Stream<String> s10 = Stream.of("brown-", "bear-");
        s10.sorted().forEach(System.out::println);

        Stream<String> s11 = Stream.of("brown-", "bear-", "grizzly-");
        s11.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        var listlist = List.of("Toby", "Anna", "Leroy", "Alex");
        listlist.stream().filter(n -> n.length() == 4).sorted().limit(2).forEach(System.out::println);

        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        System.out.println(integerStream.mapToInt(x -> x).sum());

        DoubleStream doubleStream = DoubleStream.of(1.0, 1.1, 1.2);
        System.out.println("doubleStream.average() : " + doubleStream.average());

        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream = objStream.mapToInt(x -> x.length());
        intStream.forEach(System.out::println);

        LongStream longStream = LongStream.of(5, 10);
        long sum = longStream.sum();
        System.out.println("longStream.sum() : " + sum);

        var streamList = List.of("Toby", "Anna", "Leroy", "Alex");
        Spliterator<String> originalList = streamList.spliterator();
        Spliterator<String> splitList = originalList.trySplit();
        splitList.forEachRemaining(System.out::println);

        var ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println(result);

        var ohMy2 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map = ohMy2.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(map);

        //Stream<Integer> evenNumbers = Stream.iterate(0, n -> n + 2);
        //evenNumbers.forEach(System.out::println);

        var iterateStream = Stream.iterate("", (q) -> q + "1");
        System.out.println(iterateStream.limit(2).map(x -> x + "2"));

        var generateStream = Stream.generate(() -> "growl!");

        // takes seed/starting value as first parameter, next lambda expression
        // Stream<Integer> oddNumbers = Stream.iterate(1,n -> n + 2);
        // seed, predicate to specify when done, unaryOperator to get next value
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n < 10, n -> n + 2);
        // print stream reference
        System.out.println(oddNumbers);
        oddNumbers.forEach(System.out::println);

        Stream<String> s12 = Stream.of("w", "o", "l", "f");
        // first param supplier which creates the object that will store the results
        // second BiConsumer responsible for adding one more element to the data
        // third for taking two data collections and merging them
        StringBuilder word2 = s12.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(word2);

        Stream<String> s13 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = s13.collect(TreeSet::new,TreeSet::add,TreeSet::addAll);
        System.out.println(set);

        Stream<String> s14 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set2 = s14.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set2);

        Stream<String> s15 = Stream.of("w", "o", "l", "f");
        Set<String> set3 = s15.collect(Collectors.toSet());
        System.out.println(set3);

        Stream<Integer> oddNumbers2 = Stream.iterate(1,n -> n + 2);
        oddNumbers2.skip(5).limit(2).forEach(System.out::println);

        List<Integer> x1 = List.of(1,2,3);
        List<Integer> x2 = List.of(4,5,6);
        Stream.of(x1,x2).flatMap(x -> x.stream()).map(x -> x + 1).forEach(System.out::println);

        // convert a primitive stream int a stream of boxed objects
        IntStream s16 = IntStream.of(1,2,3);
        Stream<Integer> boxed = s16.boxed();

        // Generate a stream of constant values (e.g., "hello")
        Stream<String> helloStream = Stream.generate(() -> "hello");
        // Limit the stream to 2 elements and print them
        helloStream.limit(2).forEach(System.out::println);

        Predicate<String> stringPredicate = q -> q.startsWith("g");
        var stream3 = Stream.generate(() -> "growl!");
        System.out.println(stream3.anyMatch(stringPredicate));

        var sss = DoubleStream.of(1.2,2,4);
        sss.peek(System.out::println).filter(x -> x > 2).count();

        Optional<String> emptyOptional = Optional.empty();
        try {
            String emptyValue = emptyOptional.orElseThrow(() -> new IllegalArgumentException("Value is not present"));
            System.out.println("Empty Value: " + emptyValue);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
