package com.kodilla.good.patterns.challenges.Allegro;

public class ProductOrderService {

    private InformationService informationService;
    private OrdersService ordersService;
    private OrdersDatabase ordersDatabase;

    public ProductOrderService(final InformationService informationService, final OrdersService ordersService , final OrdersDatabase ordersDatabase) {
        this.informationService = informationService;
        this.ordersService = ordersService;
        this.ordersDatabase = ordersDatabase;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = ordersService.acceptOrder(orderRequest.getUser(), orderRequest.getOrder(), orderRequest.getOrderTime());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            ordersDatabase.createOrder(orderRequest.getUser(), orderRequest.getOrder(), orderRequest.getOrderTime());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
