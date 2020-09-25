package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics implements Statistics {

    int postPerUser;
    int commentsPerUser;
    int commentsPerPost;
    int commentcount;
    int postcount;
    List<String> userNames;

    public CalculateStatistics(List<String> userNames, int commentcount, int postcount) {
        this.commentcount = commentcount;
        this.postcount = postcount;
        this.userNames = userNames;
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
        postPerUser = postcount / userNames.size();
        commentsPerPost = commentcount / postcount;
        commentsPerUser = commentcount / userNames.size();
    }
}




