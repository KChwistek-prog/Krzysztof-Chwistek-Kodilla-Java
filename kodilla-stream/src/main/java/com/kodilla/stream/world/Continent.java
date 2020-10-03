package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Continent {
    Country country = new Country();
    BigDecimal poland = country.getPeopleQuantity(new BigDecimal("2367354763"));
    BigDecimal germany = country.getPeopleQuantity(new BigDecimal("3537476322"));
    BigDecimal france = country.getPeopleQuantity((new BigDecimal("56374376255")));
    BigDecimal china = country.getPeopleQuantity(new BigDecimal("25679748874"));
    BigDecimal russia = country.getPeopleQuantity(new BigDecimal("14379748874"));

    public List<BigDecimal> europe() {
        List<BigDecimal> europe = new ArrayList<>();
        europe.add(poland);
        europe.add(germany);
        europe.add(france);
        return europe;
    }

    public List<BigDecimal> asia() {
        List<BigDecimal> asia = new ArrayList<>();
        asia.add(china);
        asia.add(russia);
        return asia;
    }

}
