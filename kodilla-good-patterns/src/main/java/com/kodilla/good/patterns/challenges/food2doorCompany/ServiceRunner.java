package com.kodilla.good.patterns.challenges.food2doorCompany;

public class ServiceRunner {
    public static void main(String[] args) {

        HealthyShop healthyShop;

        OrderService orderService = new OrderService();
        ProducersService producersService = new ProducersService();
        InfoService infoService = new InfoService("e-mail");


        orderService.createOrder(new Order(new Product("Muu!!", "milk"), 45, "665"), HealthyShop);

   //    Order milkOrder = new Order(new Product("Muuu!", "milk"), 123, "45523");
   //    Producer producerOne = new Producer("HealthyShop", "Flowers Str. 88/102", true);


        GeneralOrdersService generalOrdersService = new GeneralOrdersService(infoService, orderService, producersService);
        generalOrdersService.processOrder();


      //  infoService.inform("HealthyFood");

    }
}
