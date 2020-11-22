package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //Given
        User john = new Millennials("John");
        User bob = new XGeneration("Bob");
        User rob = new YGeneration("Rob");

        //When
        String johnPostsOnFb = john.sharePost();
        System.out.println(johnPostsOnFb);
        String bobPostsOnTwitter = bob.sharePost();
        System.out.println(bobPostsOnTwitter);
        String robPostsOnSnapchat = rob.sharePost();
        System.out.println(robPostsOnSnapchat);

        //Then
        assertEquals("Post on Facebook", johnPostsOnFb);
        assertEquals("Post on Twitter", bobPostsOnTwitter);
        assertEquals("Post on Snapchat", robPostsOnSnapchat);
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User tom = new XGeneration("Tom");

        //When
        String tomPosts = tom.sharePost();
        System.out.println(tomPosts);
        tom.setSocialPublisher(new FacebookPublisher());
        tomPosts = tom.sharePost();
        System.out.println(tomPosts);

        //Then
        assertEquals("Post on Facebook", tomPosts);
    }
}
