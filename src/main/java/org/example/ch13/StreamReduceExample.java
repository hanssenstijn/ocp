package org.example.ch13;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum = numbers.stream()
                .reduce((a, b) -> a + b);
        System.out.println(sum);

        // Sometimes, you might provide an identity value, which is a starting point for the reduction.
        // The identity value must be neutral with respect to the reduction operation.
        Integer sum2 = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum2);

        System.out.println(List.of('w', 'o', 'l', 'f')
                .parallelStream()
                .reduce("", (s1, c) -> s1 + c, (s2, s3) -> s2 + s3));


    }
}
