package com.kodilla.exception.test;

public class RouteNotFoundException extends Throwable {
    public static void main(String[] args) {

        try {
            FindFlight findFlight = new FindFlight();
            Flight krakowToSosnowiec = new Flight("Krakow", "Sosnowiec");
            findFlight.findFlight(krakowToSosnowiec);

        } catch (RouteNotFoundException e) {
            System.out.println("No such flight");
        }
    }
}