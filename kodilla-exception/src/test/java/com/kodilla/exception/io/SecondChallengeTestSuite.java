package com.kodilla.exception.io;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.Test;

public class SecondChallengeTestSuite {
    @Test
    public void testXHigher() throws ExceptionHandling {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        secondChallenge.probablyIWillThrowException(2, 2);
    }
}
