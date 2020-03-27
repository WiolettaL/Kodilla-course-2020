package com.kodilla.good.patterns.challenges.food2doorCompany;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    public List<Order> ordersList = new ArrayList<>();

    public void createOrder(Order order, Producer producer) {
        if(order.getAmount() != 0 && producer.isAvailable() == true) {
            ordersList.add(order);
            System.out.println("Order number " + order.getOrderIdNumber() + " has been created.");
        } else {
            System.out.println("No new orders.");
        }
    }

    public List<Order> getOrdersList() {
        System.out.println("Current orders: " + ordersList.size());
        return ordersList;
    }

    @Override
    public String toString() {
        return "OrderService{" +
                "ordersList=" + ordersList +
                '}';
    }
}
