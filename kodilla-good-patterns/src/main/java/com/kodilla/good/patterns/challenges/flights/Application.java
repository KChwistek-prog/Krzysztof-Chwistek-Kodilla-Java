package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {

        Flight flight1 = new Flight("Warszawa", "Kraków");
        Flight flight2 = new Flight("Gdańsk", "Kraków");
        Flight flight3 = new Flight("Wąchock", "Berlin");
        Flight flight4 = new Flight("Tychy", "Kraków");
        Flight flight5 = new Flight("Warszawa", "Iława");

        FlightList flightList = new FlightList();
        flightList.setFlightList(flight1, "Warszawa");
        flightList.setFlightList(flight2, "Sosnowiec");
        flightList.setFlightList(flight3, "Moskwa");
        flightList.setFlightList(flight4, "Warszawa");
        flightList.setFlightList(flight5, "Rzeszów");

        FlightService flightService = new FlightService(flightList);


        flightService.findFlightFrom("Warszawa");
        flightService.findFlightTo("Kraków");
        flightService.findFlightThru("Warszawa");

    }
}
