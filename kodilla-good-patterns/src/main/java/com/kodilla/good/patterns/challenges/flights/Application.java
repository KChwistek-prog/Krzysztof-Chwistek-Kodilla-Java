package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {

        Flight flight1 = new Flight("Warszawa", "Kraków");
        Flight flight2 = new Flight("Gdańsk", "Kraków");
        Flight flight3 = new Flight("Wąchock", "Berlin");
        Flight flight4 = new Flight("Tychy", "Kraków");
        Flight flight5 = new Flight("Warszawa", "Zgierz");
        Flight flight6 = new Flight("Kraków", "Iława");
        Flight flight7 = new Flight("Berlin", "Iława");

        FlightList flightList = new FlightList();
        flightList.setFlightList(flight1);
        flightList.setFlightList(flight2);
        flightList.setFlightList(flight3);
        flightList.setFlightList(flight4);
        flightList.setFlightList(flight5);
        flightList.setFlightList(flight6);
        flightList.setFlightList(flight7);

        FlightService flightService = new FlightService(flightList);


        flightService.findFlightFrom("Warszawa");
        System.out.println("\n");
        flightService.findFlightTo("Kraków");
        System.out.println("\n");
        flightService.findFlightThru("Warszawa", "Iława");

    }
}
