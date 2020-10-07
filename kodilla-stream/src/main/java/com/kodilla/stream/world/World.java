package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public class World {
    private final ArrayList<Continent> earth = new ArrayList<>();

    public static void main(String[] args) {
        Continent europe = new Continent();
        Continent asia = new Continent();
        World world = new World();
        Country poland = new Country();
        Country france = new Country();
        Country germany = new Country();
        Country china = new Country();
        Country russia = new Country();
        poland.setPeopleQuantity(new BigDecimal("2367354763"));
        france.setPeopleQuantity(new BigDecimal("56374376255"));
        germany.setPeopleQuantity(new BigDecimal("3537476322"));
        china.setPeopleQuantity(new BigDecimal("25679748874"));
        russia.setPeopleQuantity(new BigDecimal("14379748874"));

        europe.addCountry(poland);
        europe.addCountry(france);
        europe.addCountry(germany);
        asia.addCountry(china);
        asia.addCountry(russia);

        world.addContinentToEarth(europe);
        world.addContinentToEarth(asia);

        System.out.println("Population: " + world.getPeopleQuantity(world.getEarth()));
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
                .flatMap(Collection::stream)
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

}