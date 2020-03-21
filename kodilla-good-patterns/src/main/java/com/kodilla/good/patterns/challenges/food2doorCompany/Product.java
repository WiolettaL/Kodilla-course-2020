package com.kodilla.good.patterns.challenges.food2doorCompany;

public final class Product {

    private final String productName;
    private final String productType;

    public Product(final String productName, final String productType) {
        this.productName = productName;
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductType() {
        return productType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                '}';
    }
}
