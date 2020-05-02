package com.kodilla.good.patterns.challenges.flights;

public class FlightsRunnerApp {
    public static void main(String[] args) {

        FlightsController flightsController = new FlightsController();
        System.out.println(flightsController.departureFlights("WRO"));

        FlightsController arrivalFlightsController = new FlightsController();
        System.out.println(arrivalFlightsController.arrivalFlights("KRK"));

     //  FlightsController connectionFlightsController = new FlightsController();
     //  System.out.println(connectionFlightsController.connectedFlights("RZE", "WAW", "GDA"));
    }

}
