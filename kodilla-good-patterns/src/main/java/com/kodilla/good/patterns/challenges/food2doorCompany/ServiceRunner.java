package com.kodilla.good.patterns.challenges.food2doorCompany;

public class ServiceRunner {
    public static void main(String[] args) {

        OrderService orderService = new OrderService();
        ProducersService producersService = new ProducersService();
        InfoService infoService = new InfoService("e-mail");

        Producer hsProducer = new HealthyShop("HealthyShop", "Flowers Str. 88/102", true);
        Producer gfsProducer = new GlutenFreeShop("GlutenFreeShop", "Gluten Str. 564/92", true);
        Producer efsProducer = new ExtraFoodShop("ExtraFoodShop", "Extra Str. 543/98", true);

        producersService.contractProducer(hsProducer);
        producersService.contractProducer(gfsProducer);
        producersService.contractProducer(efsProducer);

        System.out.println();

        orderService.createOrder(new Order(new Product("Muu!!", "milk"), 45, "665"), hsProducer);
        orderService.createOrder(new Order(new Product("Corny", "oats"), 1, "666"), gfsProducer);
        orderService.createOrder(new Order(new Product("chickpeas", "vegetables"), 150, "667"), efsProducer);

        System.out.println();

        GeneralOrdersService generalOrdersService = new GeneralOrdersService(infoService, orderService, producersService);
        generalOrdersService.processOrder();

        System.out.println();

        infoService.inform(hsProducer);
        infoService.inform(gfsProducer);
        infoService.inform(efsProducer);

    }
}
