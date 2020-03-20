package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public interface OrdersService {

    boolean acceptOrder(User user, Order order, LocalDateTime orderTime);

}
