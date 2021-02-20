package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.List;

public class FlightList {

    private final List<Flight> flightList = new ArrayList<>();

    public void addFlight(Flight flight){
        flightList.add(flight);
    }

    public Flight getFlightList(int index) {
        return flightList.get(index);
    }
}