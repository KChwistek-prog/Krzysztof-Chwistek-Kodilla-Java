package com.kodilla.good.patterns.challenges;

public interface InformationService {
    default void sendMail(String messege){
        System.out.println(messege);
    }
}

