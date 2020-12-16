package com.kodilla.good.patterns.challenges.foodShop;

public class Product {
    private final String name;
    private int inStock;
    private double price;

    public Product(String name, int inStock, double price) {
        this.name = name;
        this.inStock = inStock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getInStock() {
        return inStock;
    }

    public double getPrice() {
        return price;
    }
}
