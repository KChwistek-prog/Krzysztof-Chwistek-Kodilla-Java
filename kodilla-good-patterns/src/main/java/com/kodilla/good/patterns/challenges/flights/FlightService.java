package com.kodilla.good.patterns.challenges.flights;

public class FlightService {
    FlightList flightList;

    public FlightService(FlightList flightList) {
        this.flightList = flightList;
    }

    public void findFlightFrom(String startingLocation) {
        flightList.getFlightList().keySet().stream()
                .filter(e -> e.startPoint.equals(startingLocation))
                .map(Flight::toString)
                .forEach(System.out::println);

    }

    public void findFlightTo(String endLocation) {
        flightList.getFlightList().keySet().stream()
                .filter(e -> e.endPoint.equals(endLocation))
                .map(Flight::toString)
                .forEach(System.out::println);
    }

    public void findFlightThru(String thruLocation) {
        flightList.getFlightList().entrySet().stream()
                .filter(e -> e.getValue().equals(thruLocation))
                .forEach(System.out::println);
    }
}
