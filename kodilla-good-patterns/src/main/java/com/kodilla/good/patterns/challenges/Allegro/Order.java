package com.kodilla.good.patterns.challenges.Allegro;

public class Order {

    private String productType;
    private String brandName;
    private Integer orderId;

    public Order(String productType, String brandName, Integer orderId) {
        this.productType = productType;
        this.brandName = brandName;
        this.orderId = orderId;
    }

    public String getProductType() {
        return productType;
    }

    public String getBrandName() {
        return brandName;
    }

    public Integer getOrderId() {
        return orderId;
    }

    @Override
    public int hashCode() {
        return orderId;
    }

    @Override
    public boolean equals(Object o) {
        Order r = (Order) o;
        return (productType.equals(r.getProductType())) && (brandName.equals(r.getBrandName())) &&
                (orderId.equals(r.getOrderId()));
    }

    @Override
    public String toString() {
        return productType + ", " + brandName + ", order: " + orderId;
    }

}
