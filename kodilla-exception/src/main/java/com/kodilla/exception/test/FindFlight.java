package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public static void main(String[] args) throws RouteNotFoundException {
        FindFlight findFlight = new FindFlight();
        FlightList flightList = new FlightList();
        flightList.addFlight(new Flight("Sosnowiec", "Wachock"));
        flightList.addFlight(new Flight("Wachock", "Berlin"));
        findFlight.findFlight(flightList.getFlightList(0));
    }

    public Map<String, Boolean> listOfAvailableAirports() {
        Map<String, Boolean> airportList = new HashMap<>();
        airportList.put("Berlin", false);
        airportList.put("Warsaw", true);
        airportList.put("Wachock", true);
        airportList.put("Krakow", false);
        airportList.put("Barcelona", true);
        airportList.put("Sosnowiec", false);
        return airportList;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportList = listOfAvailableAirports();


        String end = flight.getArrivalAirport();
        String start = flight.getDepartureAirport();

        if (airportList.containsKey(start) && airportList.containsKey(end)) {
            if (airportList.get(start) == true && airportList.get(end) == true) {
                System.out.println("Flight available");
            } else {
                System.out.println("Flight unavailable");
            }
        } else {
            throw new RouteNotFoundException();
        }


    }
}