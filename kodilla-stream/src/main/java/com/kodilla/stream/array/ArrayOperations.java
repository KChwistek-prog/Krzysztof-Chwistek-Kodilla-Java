package com.kodilla.stream.array;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(Integer[] numbers){

        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                        .forEach(System.out::println);

        Double avg = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average().getAsDouble();
                return avg;
    }
}
