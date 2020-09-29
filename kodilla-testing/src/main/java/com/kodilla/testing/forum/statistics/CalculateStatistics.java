package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics implements Statistics {

    private int postPerUser;
    private int commentsPerUser;
    private int commentsPerPost;
    private int postsCount;
    private int commentCount;
    List<String> usersNames;

    public void setCommentsPerPost(int commentsPerPost) {
        this.commentsPerPost = commentsPerPost;
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
        return postsCount;
    }

    public int commentsCount() {
        return commentCount;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        commentCount = 34;
        postsCount = 45;
        //postPerUser = postsCount();
        //commentsPerUser = commentsCount();
        postPerUser = postsCount / usersNames.size();
        commentsPerPost = commentCount / postsCount;
        commentsPerUser = commentCount / usersNames.size();
        setCommentsPerPost(commentsPerPost);
        setPostsCount(postsCount());
    }


}




