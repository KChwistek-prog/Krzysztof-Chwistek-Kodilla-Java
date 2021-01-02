package com.kodilla.good.patterns.challenges.flights;

import java.util.*;

public class FlightList {
    private List<Flight> flightList = new ArrayList<>();

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(Flight flight) {
        this.flightList.add(flight);
    }
}
