package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {
        boolean paymentAccepted = true;
        UserCart userCart = new UserCart("Hammer");
        User user = new User("John");
        ProductOrdersService productOrdersService = new ProductOrdersService();
        productOrdersService.orderProcess(paymentAccepted, user, userCart.getCart());
    }
}
