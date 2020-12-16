package com.kodilla.good.patterns.challenges.foodShop;

public class Application {
    public static void main(String[] args) {
        Product product1 = new Product("ProductName", 6, 4.00);
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("GlutenFreeSop", product1, 5);
        glutenFreeShop.process();
    }
}
