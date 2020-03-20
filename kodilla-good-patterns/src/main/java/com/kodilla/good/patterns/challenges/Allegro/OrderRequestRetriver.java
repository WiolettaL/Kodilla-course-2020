package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class OrderRequestRetriver {

    public OrderRequest retrive() {

    User user = new User("Tymon", "Speed", "need4speedTym");
    Order order = new Order("computer", "Apple", 33452);

    LocalDateTime orderTime = LocalDateTime.of(2020, 02, 14, 13, 33);

    return new OrderRequest(user, order, orderTime);

    }
}
