package com.kodilla.good.patterns.challenges.food2doorCompany;

public class ExtraFoodShop implements ProducerInterface {

    Producer extraFoodShop = new Producer("Extra Food Shop", "Extra Str. 22/13", true);

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
