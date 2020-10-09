package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {

    private static final String EXCEPTION_MESSAGE = "Error! Airport dont exist!";

    public RouteNotFoundException() {
        super(EXCEPTION_MESSAGE);
    }
}