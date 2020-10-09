package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.List;

public class RouteNotFoundException extends Throwable {
    public static void main(String[] args) {
        try {
            FindFlight findFlight = new FindFlight();
            FlightList flightList = new FlightList();
            flightList.addFlight(new Flight("xx", "Wachock"));
            flightList.addFlight(new Flight("Wachock", "Berlin"));
            findFlight.findFlight(flightList.getFlightList(0));
        } catch (RouteNotFoundException e) {
            System.out.println("Airport doesnt exist in list");
        }
    }
}