package com.kodilla.good.patterns.challenges.food2doorCompany;

public class GeneralOrdersService {

    private final InfoService infoService;
    private final OrderService orderService;
    private final ProducersService producersService;

    public GeneralOrdersService(final InfoService infoService, final OrderService orderService, final ProducersService producersService) {
        this.infoService = infoService;
        this.orderService = orderService;
        this.producersService = producersService;
    }

    public void processOrder() {
        System.out.println("Creating order...\n" + orderService.getOrdersList() + "\n" + producersService.getProducersSet());
    }


}