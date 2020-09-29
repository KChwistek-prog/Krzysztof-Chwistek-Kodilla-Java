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
  //  @Mock
   // private Statistics statisticsMock;

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
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> userNames = generateFakeUser(35);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(588);
        when(statisticsMock.postsCount()).thenReturn(0);
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double resultCommentsPerPost = calculateStatistics.getCommentsPerPost();
        double resultPostPerUser = calculateStatistics.getPostPerUser();
        double resultCommentPerUser = calculateStatistics.getCommentsPerUser();
        //Then
        Assertions.assertEquals(0.0, resultCommentsPerPost, 0.1);
        Assertions.assertEquals(0.0, resultCommentPerUser, 0.1);
        Assertions.assertEquals(0.0, resultPostPerUser, 0.1);
    }

    @Test
    public void testCalculateStatisticsWith1kPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> userNames = generateFakeUser(56);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(588);
        when(statisticsMock.postsCount()).thenReturn(1000);
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        double resultCommentsPerPost = calculateStatistics.getCommentsPerPost();
        double resultPostPerUser = calculateStatistics.getPostPerUser();
        double resultCommentPerUser = calculateStatistics.getCommentsPerUser();
        //Then
        Assertions.assertEquals(0.588, resultCommentsPerPost, 0.1);
        Assertions.assertEquals(10.5, resultCommentPerUser, 0.1);
        Assertions.assertEquals(17.85, resultPostPerUser, 0.1);
    }

    @Test
    public void testCalculateStatisticsWithNoComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> userNames = generateFakeUser(45);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(365);
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        double resultCommentsPerPost = calculateStatistics.getCommentsPerPost();
        double resultPostPerUser = calculateStatistics.getPostPerUser();
        double resultCommentPerUser = calculateStatistics.getCommentsPerUser();
        //Then
        Assertions.assertEquals(0.0, resultCommentsPerPost, 0.1);
        Assertions.assertEquals(0.0, resultCommentPerUser, 0.1);
        Assertions.assertEquals(0.0, resultPostPerUser, 0.1);
    }

    @Test
    public void testCalculateStatisticsWhenCommentsLesserThenPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> userNames = generateFakeUser(74);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(267);
        when(statisticsMock.postsCount()).thenReturn(475);
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        double resultCommentsPerPost = calculateStatistics.getCommentsPerPost();
        double resultPostPerUser = calculateStatistics.getPostPerUser();
        double resultCommentPerUser = calculateStatistics.getCommentsPerUser();
        //Then
        Assertions.assertEquals(0.56, resultCommentsPerPost, 0.1);
        Assertions.assertEquals(3.60, resultCommentPerUser, 0.1);
        Assertions.assertEquals(6.41, resultPostPerUser, 0.1);
    }

    @Test
    public void testCalculateStatisticsWhenMoreCommentsThenPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> userNames = generateFakeUser(35);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(588);
        when(statisticsMock.postsCount()).thenReturn(365);
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        double resultCommentsPerPost = calculateStatistics.getCommentsPerPost();
        double resultPostPerUser = calculateStatistics.getPostPerUser();
        double resultCommentPerUser = calculateStatistics.getCommentsPerUser();
        //Then
        Assertions.assertEquals(1.61, resultCommentsPerPost, 0.1);
        Assertions.assertEquals(16.8, resultCommentPerUser, 0.1);
        Assertions.assertEquals(10.42, resultPostPerUser, 0.1);
    }

    @Test
    public void testCalculateStatisticsWhenNoUser(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> userNames = generateFakeUser(0);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(588);
        when(statisticsMock.postsCount()).thenReturn(365);
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        double resultCommentsPerPost = calculateStatistics.getCommentsPerPost();
        double resultPostPerUser = calculateStatistics.getPostPerUser();
        double resultCommentPerUser = calculateStatistics.getCommentsPerUser();
        //Then
        Assertions.assertEquals(0.0, resultCommentsPerPost, 0.1);
        Assertions.assertEquals(0.0, resultCommentPerUser, 0.1);
        Assertions.assertEquals(0.0, resultPostPerUser, 0.1);
    }
    @Test
    public void testCalculateStatisticsWith100User(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> userNames = generateFakeUser(100);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(588);
        when(statisticsMock.postsCount()).thenReturn(365);
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        double resultCommentsPerPost = calculateStatistics.getCommentsPerPost();
        double resultPostPerUser = calculateStatistics.getPostPerUser();
        double resultCommentPerUser = calculateStatistics.getCommentsPerUser();
        //Then
        Assertions.assertEquals(1.61, resultCommentsPerPost, 0.1);
        Assertions.assertEquals(5.88, resultCommentPerUser, 0.1);
        Assertions.assertEquals(3.65, resultPostPerUser, 0.1);
    }


}