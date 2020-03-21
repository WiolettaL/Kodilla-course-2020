package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsDatabase {

    public static List<Flight> getFlightsList() {
        List<Flight> flightsList = new ArrayList<>();

        flightsList.add(new Flight("WRO", "WAW"));
        flightsList.add(new Flight("WAW", "WRO"));
        flightsList.add(new Flight("GDN", "WRO"));
        flightsList.add(new Flight("WRO", "GDN"));
        flightsList.add(new Flight("WRO", "KRK"));
        flightsList.add(new Flight("KRK", "WRO"));
        flightsList.add(new Flight("RZE", "WAW"));
        flightsList.add(new Flight("WAW", "RZE"));
        flightsList.add(new Flight("KRK", "WAW"));
        flightsList.add(new Flight("WAW", "GDA"));

        return flightsList;
    }


}
