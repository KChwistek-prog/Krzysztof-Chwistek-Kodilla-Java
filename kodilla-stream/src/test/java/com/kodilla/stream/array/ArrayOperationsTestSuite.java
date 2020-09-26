package com.kodilla.stream.array;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Test
    public void testGetAverage(){
        //given
        int[]numbers = new int[4];

        //when
        double result = ArrayOperations.getAverage(numbers);
        //then
        assertEquals(2.0, result,0.01);
    }

}
