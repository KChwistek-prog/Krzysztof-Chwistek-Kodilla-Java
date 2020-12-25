package com.kodilla.good.patterns.challenges.flights;

import java.util.*;

public class FlightList {
    private Map<Flight, String> flightList = new HashMap<>();

    public Map<Flight, String> getFlightList() {
        return flightList;
    }

    public void setFlightList(Flight flight, String thru) {
        this.flightList.put(flight, thru);
    }
}
