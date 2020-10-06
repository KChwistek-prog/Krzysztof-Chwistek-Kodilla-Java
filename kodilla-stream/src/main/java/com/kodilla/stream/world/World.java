package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public class World {
    private final ArrayList<Continent> earth = new ArrayList<>();

    public static void main(String[] args) {
        Country country = new Country();
        Continent europe = new Continent();
        Continent asia = new Continent();
        World world = new World();

        BigDecimal poland = country.getPeopleQuantity(new BigDecimal("2367354763"));
        BigDecimal germany = country.getPeopleQuantity(new BigDecimal("3537476322"));
        BigDecimal france = country.getPeopleQuantity(new BigDecimal("56374376255"));
        BigDecimal china = country.getPeopleQuantity(new BigDecimal("25679748874"));
        BigDecimal russia = country.getPeopleQuantity(new BigDecimal("14379748874"));

        europe.addCountryToContinent("Poland", poland);
        europe.addCountryToContinent("France", france);
        europe.addCountryToContinent("Germany", germany);
        asia.addCountryToContinent("China", china);
        asia.addCountryToContinent("Russia", russia);

        world.addContinentToEarth(europe);
        world.addContinentToEarth(asia);
        world.getPeopleQuantity(world.getEarth());
    }

    public ArrayList<Continent> getEarth() {
        return earth;
    }

    public void addContinentToEarth(Continent contiName) {
        earth.add(contiName);
    }

    public BigDecimal getPeopleQuantity(ArrayList<Continent> flatEarth) {
        return flatEarth.stream()
                .map(Continent::getContinent)
                .map(HashMap::values)
                .flatMap(Collection::stream)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }

}