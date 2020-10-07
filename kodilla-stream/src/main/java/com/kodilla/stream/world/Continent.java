package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;


public class Continent {
    private List<Country> continent = new ArrayList<>();

    public List<Country> getContinent() {
        return continent;
    }

    public void addCountry(Country country) {
        continent.add(country);
    }

    public void removeCountry(int index) {
        continent.remove(index);
    }
}
