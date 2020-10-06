package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Continent {
    private List<Country> continent = new ArrayList<>();

    public List<Country> getContinent() {
        return continent;
    }

    public void addCountryToContinent(Country countryPopulation) {
        continent.add(countryPopulation);
    }

    public void removeCountryFromContinent(int value) {
        continent.remove(value);
    }
}
