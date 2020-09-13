package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.*;

class CollectionTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Test: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test: end");
    }

    @Test
    @DisplayName("Testing empty table")
    void testOddNumbersExterminatorEmptyList(){
        //given
        List<Integer> testEmptyList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //when
        List<Integer> result = oddNumbersExterminator.exterminate(testEmptyList);

        //then
        Assertions.assertEquals(testEmptyList, result);
    }


    @DisplayName("Testing mixed table")
    @Test
    void testOddNumbersExterminatorNormalList(){
        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i <= 200; i++){
            numbers.add(i);
        }
        //when
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        //result.add(7);
        //then
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) % 2 != 0){
                System.out.println(result.get(i));
                System.out.println("Error! Value not even");
                break;
            }
        }
    }
}
