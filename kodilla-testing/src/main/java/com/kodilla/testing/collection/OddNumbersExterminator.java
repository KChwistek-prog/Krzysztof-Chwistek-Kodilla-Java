package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> even = new ArrayList<>();
        for (int actualNum : numbers) {
            if (actualNum % 2 == 0 && actualNum != 0){
                even.add(actualNum);
            }
        }
        return even;
    }
}

