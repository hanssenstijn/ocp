package org.example.ch13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelStreams {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Edward");

        names.parallelStream()
                .forEach(name -> System.out.println(name + " - " + Thread.currentThread().getName()));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream()
                .parallel()
                .reduce(0, Integer::sum);

        var array = new ArrayList<Thread>();
        var stream = array.stream();
        var p = stream.parallel();
        var ps = array.parallelStream();

        // peek on parallel stream will process the elements concurrently, so the order cannot be determined ahead of
        // time
        // forEachOrdered method will process the elements in the order in which they are stored in the stream
        var data = List.of(2,5,1,9,8);
        data.stream().parallel().mapToInt(s -> s)
                .peek(System.out::println)
                .forEachOrdered(System.out::println);

        var data2 = List.of(List.of(1,2), List.of(3,4),List.of(5,6));
        data2.stream().flatMap(s -> s.stream()).findFirst().ifPresent(System.out::println);
    }
}
