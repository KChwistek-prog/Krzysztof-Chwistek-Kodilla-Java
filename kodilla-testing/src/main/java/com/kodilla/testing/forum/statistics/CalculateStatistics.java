package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics implements Statistics {

    private int postPerUser;
    private int commentsPerUser;
    private int commentsPerPost;
    private int postsCount;
    private int commentCount;
    List<String> usersNames;

    public int calculateAdvStatistics(Statistics statistics) {

        postPerUser = postsCount / usersNames.size();
        commentsPerPost = commentCount / postsCount;
        commentsPerUser = commentCount / usersNames.size();
        setPostsCount(commentsPerPost);
        return commentsPerPost;
    }

    public void setPostsCount(int postsCount) {
        this.postsCount = postsCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

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


}




