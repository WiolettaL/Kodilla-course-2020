package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private Order order;
    private LocalDateTime orderTime;

    public OrderRequest(final User user, final Order order, final LocalDateTime orderTime){
        this.user = user;
        this.order = order;
        this.orderTime = orderTime;
    }

    public User getUser() {
        return user;
    }

    public Order getOrder() {
        return order;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}
