package com.kodilla.good.patterns.challenges.food2doorCompany;

public class ExtraFoodShop extends Producer implements ProducerInterface {

    public ExtraFoodShop(String producerName, String address, boolean isAvailable) {
        super(producerName, address, isAvailable);
    }

    @Override
    public boolean process(Order order) {
        if(order.getAmount() >= 20) {
            System.out.println("Thank you for shopping and welcome again");
            return true;
        } else {
            System.out.println("The quantity is insufficient to accept...");
            return false;
        }
    }
}
