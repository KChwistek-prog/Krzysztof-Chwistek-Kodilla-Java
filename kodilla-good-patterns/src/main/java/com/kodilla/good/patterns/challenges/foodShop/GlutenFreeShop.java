package com.kodilla.good.patterns.challenges.foodShop;


public class GlutenFreeShop extends Supplier{

    public GlutenFreeShop(String name, Product product, ProductList productList, int orderQuantity) {
        super(name, product, productList, orderQuantity);
    }

    @Override
    public void process() {
        if(getProductList().getProductAvailability(getProduct()) >= getOrderQuantity()){
            System.out.println("Order in GlutenFreeShop " + getProduct().getName() + " for " + getOrderQuantity() * getProduct().getPrice() + "$ \n");
        } else {
            System.out.println("Product unavailable in that amount");
        }
    }
}

