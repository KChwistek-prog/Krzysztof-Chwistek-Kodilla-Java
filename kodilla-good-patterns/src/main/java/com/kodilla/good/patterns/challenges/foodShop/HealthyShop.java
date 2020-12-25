package com.kodilla.good.patterns.challenges.foodShop;

public class HealthyShop extends Supplier {
    private int discount;

    public HealthyShop(String name, Product product, ProductList productList, int orderQuantity, int discount) {
        super(name, product, productList, orderQuantity);
        this.discount = discount;
    }

    @Override
    public void process() {
        double sum = getOrderQuantity() * (getProduct().getPrice() - ((getProduct().getPrice() * discount) / 100));
        if(getProductList().getProductAvailability(getProduct()) >= getOrderQuantity()){
            System.out.print("Order in HealthyShop " + getProduct().getName() + " for ");
            System.out.printf("%.2f", sum);
            System.out.println(" $ \n");
        } else {
            System.out.println("Product unavailable in that amount");
        }
    }
}
