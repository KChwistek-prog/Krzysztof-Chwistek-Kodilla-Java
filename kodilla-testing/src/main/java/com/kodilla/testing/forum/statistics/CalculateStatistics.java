package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics implements Statistics{

    private int commentsPerUser;
    private int commentsPerPost;
    List<String> usersNames;

    public int getCommentsPerUser() {
        return commentsPerUser;
    }

    public int getCommentsPerPost() {
        return commentsPerPost;
    }

    public List<String> usersNames() {
        return null;
    }

    public int postsCount() {
        return 0;
    }

    public int commentsCount() {
        return 0;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        int postsCount = statistics.postsCount();
        int commentCount = statistics.commentsCount();
        commentsPerPost = postsCount / commentCount;
    }
}




