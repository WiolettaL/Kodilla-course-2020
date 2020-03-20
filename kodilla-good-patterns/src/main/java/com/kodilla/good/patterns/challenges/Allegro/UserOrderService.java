package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class UserOrderService implements OrdersService {

    @Override
    public boolean acceptOrder(User user, Order order, LocalDateTime orderTime){
        if(user != null || order != null || orderTime != null) {
            return true;
        } else {
            System.out.println("Order has not been accepted!");
            return false;
        }
    }
}
