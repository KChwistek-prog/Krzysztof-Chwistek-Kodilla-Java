package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashMap;

public class Continent {
    private HashMap<String, BigDecimal> continent = new HashMap<String, BigDecimal>();

    public HashMap<String, BigDecimal> getContinent() {
        return continent;
    }

    public void addCountryToContinent(String countryName, BigDecimal countryPopulation) {
        continent.put(countryName, countryPopulation);
    }

    public void removeCountryFromContinent(String key) {
        continent.remove(key);
    }
}
