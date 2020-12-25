package com.kodilla.good.patterns.challenges.foodShop;

public class Application {
    public static void main(String[] args) {
        ProductList productAvailability = new ProductList();
        Product product1 = new Product("ProductName", 4.00);
        Product product2 = new Product("ProductName_2", 15.00);
        Product product3 = new Product("ProductName_3", 6.40);

        productAvailability.setProductAvailability(product1, 6);
        productAvailability.setProductAvailability(product2, 8);
        productAvailability.setProductAvailability(product3, 9);

        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("GlutenFreeSop", product1, productAvailability, 5);
        HealthyShop healthyShop = new HealthyShop("HealthyShop", product2, productAvailability, 5, 5);
        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop", product3, productAvailability, 7, true);

        glutenFreeShop.process();
        healthyShop.process();
        extraFoodShop.process();
    }
}
