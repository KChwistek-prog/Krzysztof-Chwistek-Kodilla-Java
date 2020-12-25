package com.kodilla.good.patterns.challenges.foodShop;


public abstract class Supplier implements SupplierData {
    private String name;
    private Product product;
    private ProductList productList;
    private int orderQuantity;

    public Supplier(String name, Product product, ProductList productList, int orderQuantity) {
        this.name = name;
        this.product = product;
        this.productList = productList;
        this.orderQuantity = orderQuantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductList getProductList() {
        return productList;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }
}
