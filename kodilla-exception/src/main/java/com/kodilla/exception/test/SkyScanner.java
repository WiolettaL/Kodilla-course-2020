package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SkyScanner {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightsSchedule = new HashMap<>();
        flightsSchedule.put("Warsaw", true);
        flightsSchedule.put("London", false);
        flightsSchedule.put("Bergamo", true);
        flightsSchedule.put("Newark", true);

        for(Map.Entry<String, Boolean> entry : flightsSchedule.entrySet()) {
            if(flight.getDepartureAirport() == entry.getKey()) {
                return flightsSchedule.get(flight.getDepartureAirport());
            } else {
                throw new RouteNotFoundException("Sorry! Try another flight!");
            }
        }
        return flightsSchedule.get(flightsSchedule.entrySet().contains(flight.getDepartureAirport()));
    }
}
