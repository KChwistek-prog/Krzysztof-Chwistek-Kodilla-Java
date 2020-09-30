package com.kodilla.stream.array;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(Integer[] numbers){

        IntStream.range(0, numbers.length);
                Arrays.stream(numbers)
                        .forEach(System.out::println);

        IntStream.range(0, numbers.length);
        OptionalDouble avg = Arrays.stream(numbers)
                .mapToDouble(a -> a)
                .average();
        return avg.getAsDouble();
    }
}
