package org.example.ch13;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOf {
    public static void main(String[] args) {
        var cats = Stream.of("leopeard","lynx","ocelot","puma").parallel();
        var bears = Stream.of("panda","grizzly","polar").parallel();

        var data = Stream.of(cats,bears).flatMap(s -> s).collect(Collectors.groupingByConcurrent(s -> !s.startsWith(
                "p")));
        System.out.println(data.get(false).size() + " " + data.get(true).size());

        final long[] value2 = {0};
        IntStream.iterate(1,i -> 1)
                .limit(100)
                .parallel()
                .forEach(i -> ++value2[0]);
        System.out.println(value2[0]);

        Stream<Integer> evenNumbers = Stream.iterate(0, n -> n + 2);
        evenNumbers.limit(4).forEach(System.out::println);

        Stream<Integer> sameNumbers = Stream.iterate(0, n -> 2);
        sameNumbers.limit(4).forEach(System.out::println);

    }
}
