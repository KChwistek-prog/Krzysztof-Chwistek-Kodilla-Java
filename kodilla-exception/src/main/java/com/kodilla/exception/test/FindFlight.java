package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public Map<String,Boolean> ListOfAvailableAirports() {
        Map<String,Boolean> availableAirports = new HashMap<>();
        availableAirports.put("Berlin", true);
        availableAirports.put("Warsaw", true);
        availableAirports.put("Wachock", true);
        availableAirports.put("Krakow", false);
        availableAirports.put("Barcelona", true);
        return availableAirports;
    }

    public static void main(String[] args) throws RouteNotFoundException {
        FindFlight findFlight = new FindFlight();
        FlightList flightList = new FlightList();

        flightList.addFlight(new Flight("Sosnowiec", "Wachock"));
        flightList.addFlight(new Flight("Wachock", "Berlin"));
        flightList.addFlight(new Flight("Wachock", "Krakow"));

        try {
            findFlight.findFlight(flightList.getFlightList(0));
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportList = ListOfAvailableAirports();
        String end = flight.getArrivalAirport();
        String start = flight.getDepartureAirport();

        if (airportList.containsKey(start) != true || airportList.containsKey(end) != true) {
            throw new RouteNotFoundException();
        } else {
            if (airportList.get(start) == true && airportList.get(end) == true) {
                System.out.println("Flight available");
            } else {
                System.out.println("Flight unavailable");
            }
        }

    }
}