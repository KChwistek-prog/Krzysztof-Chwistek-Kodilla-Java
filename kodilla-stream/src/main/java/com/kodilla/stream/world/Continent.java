package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Continent {
    private List<BigDecimal> continent = new ArrayList<BigDecimal>();

    public List<BigDecimal> getContinent() {
        return continent;
    }

    public void addCountryToContinent(BigDecimal countryPopulation) {
        continent.add(countryPopulation);
    }

    public void removeCountryFromContinent(String key) {
        continent.remove(key);
    }
}
