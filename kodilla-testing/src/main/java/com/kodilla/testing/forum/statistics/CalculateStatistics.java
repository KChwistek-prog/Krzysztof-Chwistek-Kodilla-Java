package com.kodilla.testing.forum.statistics;

import java.sql.SQLOutput;
import java.util.List;

public class CalculateStatistics implements Statistics{

    private double commentsPerUser;
    private double commentsPerPost;
    private double postPerUser;

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }

    public double getPostPerUser() {
        return postPerUser;
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
        double postsCount = statistics.postsCount();
        double commentCount = statistics.commentsCount();
        double userCount = statistics.usersNames().size();
        if(postsCount == 0.0) {
            System.out.println("Error! No posts!");
        } else if (commentCount == 0.0){
            System.out.println("Error! No comments");
        } else if (userCount == 0.0) {
            System.out.println("Error! No users");
        } else {
            commentsPerPost = commentCount / postsCount;
            postPerUser = postsCount / userCount;
            commentsPerUser = commentCount / userCount;
        }
        //System.out.println("dzielenie " + commentsPerPost + "com na user" + commentsPerUser + "pos user" +postPerUser);
    }
}




