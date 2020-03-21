package com.kodilla.good.patterns.challenges.food2doorCompany;

public class Order {

    private Product product;
    private int amount;
    private String orderIdNumber;

    public Order(Product product, int amount, String orderIdNumber) {
        this.product = product;
        this.amount = amount;
        this.orderIdNumber = orderIdNumber;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public String getOrderIdNumber() {
        return orderIdNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (amount != order.amount) return false;
        if (!product.equals(order.product)) return false;
        return orderIdNumber.equals(order.orderIdNumber);
    }

    @Override
    public int hashCode() {
        return orderIdNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Order{" +
                "product=" + product +
                ", amount=" + amount +
                ", orderIdNumber='" + orderIdNumber + '\'' +
                '}';
    }
}
