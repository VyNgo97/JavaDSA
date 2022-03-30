package Streams;

import java.util.stream.IntStream;

/*
 * Streams can be created from Collections, Lists, Sets, ints, longs, doubles, arrays, lines of a file
 *
 * Source (see above) -> Intermediate operations (Filter/Sort/Map) -> Terminal Operation (Collect/Reduce/ForEach)
 *
 * Intermediate operations return a stream allowing us to chain multiple together
 * Terminal operations are either void or return a non-stream result (list/int/etc).
 *
 * Order matters for large datasets: filter first, then sort or map.
 * For very large datasets use ParallelStream to enable multiple threads.
 *
 * Some intermediate operations:
 *   anyMatch()      flatmap()
 *   distinct()      map()
 *   filter()        skip()
 *   findFirst()     sorted()
 *
 * Some terminal operations:
 *   forEach() applies the same function to each element
 *   collect() saves the elements into a collection
 *   other options reduce the stream to a single summary element (count(), max(), min(), reduce(), summaryStatistics())
 *   a,b,c,... => Z
 * */
public class JavaStreams {
    public static void main(String[] args) {

//        Integer Stream
        IntStream
                .range(1, 10)
                .forEach(System.out::println);

    }
}
