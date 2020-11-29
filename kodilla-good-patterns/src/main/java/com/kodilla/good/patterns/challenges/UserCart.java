package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class UserCart {
    private List<String> cart = new ArrayList<>();

    public UserCart(String productName) {
        cart.add(productName);
    }

    public List<String> getCart() {
        return cart;
    }
}
