package com.kodilla.stream.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){
        IntStream.range(1, numbers.length)
                .forEach(System.out::println);

        IntStream numberStream = IntStream.range(1, numbers.length);
        double res = numberStream
                .average()
                .getAsDouble();
        return res;
    }
}
