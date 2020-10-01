package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics implements Statistics{

    private double commentsPerUser;
    private double commentsPerPost;
    private double postPerUser;
    private double postsCount;
    private double commentCount;
    private double userCount;


    public double getPostsCount() {
        return postsCount;
    }

    public double getCommentCount() {
        return commentCount;
    }

    public double getUserCount() {
        return userCount;
    }

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
        postsCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
        userCount = statistics.usersNames().size();
        if(postsCount == 0.0) {
            System.out.println("Error! No posts!");
        } else if (commentCount == 0.0){
            System.out.println("Error! No comments!");
        } else if (userCount == 0.0) {
            System.out.println("Error! No users!");
        } else {
            commentsPerPost = commentCount / postsCount;
            postPerUser = postsCount / userCount;
            commentsPerUser = commentCount / userCount;
        }
    }
}




