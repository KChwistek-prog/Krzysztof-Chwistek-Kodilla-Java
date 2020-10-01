package com.kodilla.stream.world;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;


public class Continent {
    public List europe() {
        Country country = new Country();
        BigDecimal poland = country.getPeopleQuantity(new BigDecimal("236735463"));
        BigDecimal germany = country.getPeopleQuantity(new BigDecimal("353476322"));
        BigDecimal france = country.getPeopleQuantity((new BigDecimal("5637436255")));
        List<BigDecimal> europe = new ArrayList<>();
        europe.add(poland);
        europe.add(germany);
        europe.add(france);
        return europe;
    }
    public List asia(){
        Country country = new Country();
        BigDecimal china = country.getPeopleQuantity(new BigDecimal("2567948874"));
        BigDecimal russia = country.getPeopleQuantity(new BigDecimal("1437948874"));
        List<BigDecimal> asia = new ArrayList<>();
        asia.add(china);
        asia.add(russia);
        return asia;

    }
}
