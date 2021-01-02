package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightService {
    FlightList flightList;

    public FlightService(FlightList flightList) {
        this.flightList = flightList;
    }

    public void findFlightFrom(String startingLocation) {
        flightList.getFlightList().stream()
                .filter(e -> e.startPoint.equals(startingLocation))
                .map(Flight::toString)
                .forEach(System.out::println);

    }

    public void findFlightTo(String endLocation) {
        flightList.getFlightList().stream()
                .filter(e -> e.endPoint.equals(endLocation))
                .map(Flight::toString)
                .forEach(System.out::println);
    }

    public void findFlightThru(String startLocation, String endLocation) {
        List<Flight> startLocationList = new ArrayList<>();
        List<Flight> endLocationList = new ArrayList<>();

        for(Flight start : flightList.getFlightList()){
            if(start.startPoint.equals(startLocation)){
                startLocationList.add(start);
            }
        }

        for(Flight end : flightList.getFlightList()){
            if(end.endPoint.equals(endLocation)){
                endLocationList.add(end);
            }
        }

        for(Flight start : startLocationList){
            for(Flight end : endLocationList){
                if(start.endPoint.equals(end.startPoint)){
                    System.out.println("Lot z "  + start.startPoint + " do " + end.endPoint + " przez "  + start.endPoint);
                }
            }
        }

    }
}
