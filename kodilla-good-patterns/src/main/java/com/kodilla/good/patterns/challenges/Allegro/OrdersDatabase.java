package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public interface OrdersDatabase {

    boolean createOrder(User user, Order order, LocalDateTime orderTime);

}
