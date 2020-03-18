package com.kodilla.exception.test;

public class FlightsExceptionHandling {
    public static void main(String[] args) {
        Flight flight = new Flight("New York", "Bergamo");
        SkyScanner skyScanner = new SkyScanner();

        try {
            skyScanner.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("We don't have the flight that you're looking for.");
        } finally {
            System.out.println("Search another destination.");
        }
    }

}
