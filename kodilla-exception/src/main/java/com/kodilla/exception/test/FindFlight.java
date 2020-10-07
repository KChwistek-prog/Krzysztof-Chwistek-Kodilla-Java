package com.kodilla.exception.test;

import java.util.*;

public class FindFlight {

    public static void main(String[] args) throws RouteNotFoundException {
        FindFlight findFlight = new FindFlight();
        Flight krakowToSosnowiec = new Flight("Krakow", "Sosnowiec");
        findFlight.findFlight(krakowToSosnowiec);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        String start = flight.getDepartureAirport();
        String end = flight.getArrivalAirport();

        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Berlin", false);
        flightMap.put("Warsaw", true);
        flightMap.put("Wąchock", true);
        flightMap.put("Krakow", false);
        flightMap.put("Barcelona", true);
        flightMap.put("Sosnowiec", true);

        if (!flightMap.get(start) || !flightMap.get(end)) {
            throw new RouteNotFoundException();
        }

    }
}
