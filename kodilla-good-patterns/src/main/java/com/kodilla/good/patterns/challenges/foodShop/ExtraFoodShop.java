package com.kodilla.good.patterns.challenges.foodShop;

public class ExtraFoodShop extends Supplier {
    private boolean memberPlus;

    public ExtraFoodShop(String name, Product product, ProductList productList, int orderQuantity, boolean memberPlus) {
        super(name, product, productList, orderQuantity);
        this.memberPlus = memberPlus;
    }

    @Override
    public void process() {
        double price = getOrderQuantity() * getProduct().getPrice();

        if(memberPlus) {
            price = (price - ((price * 10) / 100));
        }
        if(getProductList().getProductAvailability(getProduct()) >= getOrderQuantity()){
            System.out.print("Order in ExtraFoodShop " + getProduct().getName() + " for ");
            System.out.printf("%.2f", price);
            System.out.println(" $\n");
        } else {
            System.out.println("Product unavailable in that amount");
        }
    }
}
