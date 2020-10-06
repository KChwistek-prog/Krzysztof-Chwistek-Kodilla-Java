package com.kodilla.exception.io;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class SecondChallengeTestSuite {
    @Test
    public void ExceptionHandling(){
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        assertAll(
                () -> assertThrows(ExceptionHandling.class, () -> secondChallenge.probablyIWillThrowException(0,1)),
                () -> assertThrows(ExceptionHandling.class, () -> secondChallenge.probablyIWillThrowException(2,1)),
                () -> assertThrows(ExceptionHandling.class, () -> secondChallenge.probablyIWillThrowException(1,1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1,1)));
        }
}
