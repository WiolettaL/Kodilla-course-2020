package com.kodilla.good.patterns.challenges.food2doorCompany;

public class HealthyShop extends Producer implements ProducerInterface  {


    public HealthyShop(String producerName, String address, boolean isAvailable) {
        super(producerName, address, isAvailable);
    }

    @Override
    public boolean process(Order order) {
        System.out.println("Creating order...");
        if (order.getAmount() >= 25) {
            System.out.println("Thank you for shopping and welcome again");
            return true;
        } else {
            System.out.println("The quantity is insufficient to accept...");
            return false;
        }
    }
}

