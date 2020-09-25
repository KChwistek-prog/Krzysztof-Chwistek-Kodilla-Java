package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.*;

public class calculateStatisticsTestSuite {
    @Mock
    private Statistics statisticsMock;
    @BeforeEach
    public void before(){
        System.out.println("Test: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test: end");
    }

    private List<String> generateFakeUser(int fakeUserNumber) {
        List<String> userNames = new ArrayList<>();
        for (int n = 1; n <= fakeUserNumber; n++) {
            userNames.add("Name" + n);
        }
        return userNames;
    }

    @Test
    void testCalculateStatisticsWithNoPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userNames = generateFakeUser(35);
        int commentCount = 788;
        int postCount = 365;
        when(statisticsMock.commentsCount()).thenReturn(commentCount);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        int result = calculateStatistics.getCommentsPerPost();

        //Then
        assertEquals(56, result);
    }


}