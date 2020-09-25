package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics implements Statistics {

    private int postPerUser;
    private int commentsPerUser;
    private int commentsPerPost;
    private int postsCount;
    private int commentCount;
    List<String> usersNames;

    public int getPostPerUser() {
        return postPerUser;
    }

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

        postPerUser = postsCount / usersNames.size();
        commentsPerPost = commentCount / postsCount;
        commentsPerUser = commentCount / usersNames.size();

    }
}




