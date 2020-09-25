package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;

public class calculateStatisticsTestSuite {
    //@Mock
    //private Statistics statisticsMock;

    @BeforeEach
    public void before(){
        System.out.println("Test: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test: end");
    }

    private static List<String> generateFakeUser(int fakeUserNumber) {
        List<String> userNames = new ArrayList<>();
        for (int n = 1; n <= fakeUserNumber; n++) {
            userNames.add("Name" + n);
        }
        return userNames;
    }

    @Test
    void testCalculateStatisticsWithNoPosts() {
        List<String> userNames = generateFakeUser(52);
        CalculateStatistics calculateStatistics = new CalculateStatistics(userNames, 456, 45);
        calculateStatistics.calculateAdvStatistics(calculateStatistics);
        System.out.println(calculateStatistics.commentsPerUser);
        }

    }