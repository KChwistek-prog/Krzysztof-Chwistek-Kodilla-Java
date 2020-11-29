package com.kodilla.good.patterns.challenges;

import java.util.List;

public class ProductOrdersService implements InformationService{

    public void orderProcess(boolean paymentAccepted, User user, List<String> cart){
        if(paymentAccepted){
            sendMail("Hi, " + user + " Payment accepted" + cart);
        } else {
            sendMail("Payment error");
        }
    }
}
