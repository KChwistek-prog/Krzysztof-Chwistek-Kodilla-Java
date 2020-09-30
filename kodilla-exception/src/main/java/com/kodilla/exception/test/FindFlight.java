package com.kodilla.exception.test;

import java.util.*;

public class FindFlight {
    public void findFilght(Flight flight) {

        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Berlin", true);
        flightMap.put("Warsaw", true);
        flightMap.put("Krakow", true);
        flightMap.put("Barcelona", false);
        flightMap.put("Hamburg", true);
        flightMap.put("Sosnowiec", false);
    }
}
