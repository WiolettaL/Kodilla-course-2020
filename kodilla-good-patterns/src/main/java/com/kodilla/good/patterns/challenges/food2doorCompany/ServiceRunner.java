package com.kodilla.good.patterns.challenges.food2doorCompany;

public class ServiceRunner {
    public static void main(String[] args) {

        Producer producer;
        HealthyShop healthyShop;

        OrderService orderService = new OrderService();
        ProducersService producersService = new ProducersService();
        InfoService infoService = new InfoService("e-mail");


        orderService.createOrder(new Order(new Product("Muu!!", "milk"), 45, "665"), healthyShop);

        GeneralOrdersService generalOrdersService = new GeneralOrdersService(infoService, orderService, producersService);
        generalOrdersService.processOrder();


        infoService.inform();

    }
}
