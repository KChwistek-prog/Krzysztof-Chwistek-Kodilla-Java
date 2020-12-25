package com.kodilla.good.patterns.challenges.foodShop;

import java.util.HashMap;
import java.util.Map;

public class ProductList {
    private Map<Product, Integer> productAvailability = new HashMap<>();

    public Integer getProductAvailability(Product product) {
        return productAvailability.get(product);
    }

    public void setProductAvailability(Product product, int inStock) {
        productAvailability.put(product, inStock);
    }

}
