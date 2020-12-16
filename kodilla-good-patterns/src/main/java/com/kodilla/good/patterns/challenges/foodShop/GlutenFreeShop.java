package com.kodilla.good.patterns.challenges.foodShop;

public class GlutenFreeShop implements Supplier{
    private final String name;
    private Product product;
    private int orderQuantity;

    public GlutenFreeShop(String name, Product product, int orderQuantity) {
        this.name = name;
        this.product = product;
        this.orderQuantity = orderQuantity;
    }

    @Override
    public void process() {
        if(product.getInStock() > 0){
            System.out.println("Order" + product.getName() + " for " + orderQuantity * product.getPrice() + "$");
        } else {
            System.out.println("Product unavailable");
        }
    }
}
