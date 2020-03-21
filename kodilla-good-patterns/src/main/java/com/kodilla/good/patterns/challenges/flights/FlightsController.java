package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsController {

    public List<Flight> departureFlights(String from) {
        return FlightsDatabase.getFlightsList().stream()
                .filter(flight -> flight.getDeparture().equalsIgnoreCase(from))
                .collect(Collectors.toList());
    }

    public List<Flight> arrivalFlights(String to) {
        return FlightsDatabase.getFlightsList().stream()
                .filter(flight -> flight.getArrival().equalsIgnoreCase(to))
                .collect(Collectors.toList());
    }

    public List<Flight> connectedFlights(String from, String via, String to) {
        List<Flight> beginning = FlightsDatabase.getFlightsList().stream()
                .filter(flight -> flight.getDeparture().equalsIgnoreCase(from))
                .filter(flight -> flight.getArrival().equalsIgnoreCase(via))
                .collect(Collectors.toList());

        List<Flight> finish = FlightsDatabase.getFlightsList().stream()
                .filter(flight -> flight.getDeparture().equalsIgnoreCase(via))
                .filter(flight -> flight.getArrival().equalsIgnoreCase(to))
                .collect(Collectors.toList());

        List allFlights = new ArrayList(beginning);
        allFlights.addAll(finish);

        return allFlights;
    }


}
