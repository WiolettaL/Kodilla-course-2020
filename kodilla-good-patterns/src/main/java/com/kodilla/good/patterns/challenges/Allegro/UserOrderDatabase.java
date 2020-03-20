package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class UserOrderDatabase implements OrdersDatabase {

    @Override
    public boolean createOrder(User user, Order order, LocalDateTime orderTime){
        if(user != null || order != null || orderTime != null) {
            return true;
        } else {
            System.out.println("Oops! Order has not been created! Try again!");
            return false;
        }
    }
}
