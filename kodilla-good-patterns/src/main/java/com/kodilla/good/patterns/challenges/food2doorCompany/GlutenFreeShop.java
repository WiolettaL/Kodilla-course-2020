package com.kodilla.good.patterns.challenges.food2doorCompany;

public class GlutenFreeShop implements ProducerInterface {

    @Override
    public boolean process(Order order) {
        if(order.getAmount() >= 15) {
            System.out.println("Thank you for shopping and welcome again");
            return true;
        } else {
            System.out.println("The quantity is insufficient to accept...");
            return false;
        }
    }
}
