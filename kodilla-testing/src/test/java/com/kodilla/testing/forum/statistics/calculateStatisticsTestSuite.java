package com.kodilla.testing.forum.statistics;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class calculateStatisticsTestSuite {
    @Mock
    private Statistics statisticsMock;

    @BeforeEach
    public void before() {
        System.out.println("Test: begin");
    }

    @AfterEach
    public void after() {
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
    public void testCalculateStatisticsWithNoPosts() {
        //Given
        //List<String> userNames = generateFakeUser(35);
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(788);
        when(statisticsMock.postsCount()).thenReturn(365);

        //When
        int result = calculateStatistics.getCommentsPerPost();

        //Then
        Assertions.assertEquals(0, result);
    }


}