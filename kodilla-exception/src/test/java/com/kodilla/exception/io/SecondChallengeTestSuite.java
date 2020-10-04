package com.kodilla.exception.io;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SecondChallengeTestSuite {
    @Test
    public void testXHigher() throws ExceptionHandling {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        Assertions.assertThrows(ExceptionHandling.class, () -> secondChallenge.probablyIWillThrowException(2,1));


    }
}
