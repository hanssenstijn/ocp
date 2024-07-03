package org.example.ch10;

import java.util.List;
import java.util.stream.Stream;

public class Streamz {
    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();
        Stream<Integer> singElement = Stream.of(1);
        Stream<Integer> ffromArray = Stream.of(1,2,3);

        var list = List.of("a","b","c");
        Stream<String> fromList = list.stream();
        Stream<String> fromListParallel = list.parallelStream();


    }
}
