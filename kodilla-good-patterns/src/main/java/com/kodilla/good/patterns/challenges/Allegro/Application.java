package com.kodilla.good.patterns.challenges.Allegro;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrive();

        ProductOrderService orderProcessor = new ProductOrderService(new UserContactService("e-mail"), new UserOrderService(), new UserOrderDatabase());
        orderProcessor.process(orderRequest);
    }
}
