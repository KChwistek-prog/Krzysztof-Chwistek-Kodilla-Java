package com.kodilla.testing.forum.statistics;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.*;

@ExtendWith(MockitoExtension.class)
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
    public void testCalculateStatisticsWithNoPosts() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        Statistics statisticsMock = mock(Statistics.class);
        //List<String> userNames = generateFakeUser(35);
        int commentCount = 788;
        int postCount = 365;
        when(statisticsMock.commentsCount()).thenReturn(commentCount);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int result = calculateStatistics.getCommentsPerPost();

        //Then
        Assertions.assertEquals(54,result);
    }


}