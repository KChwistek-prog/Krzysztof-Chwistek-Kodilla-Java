package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Continent {
    public List europe() {
        Country country = new Country();
        BigDecimal Poland = country.getPeopleQuantity().add(BigDecimal.valueOf(65746846));
        List<BigDecimal> europe = new ArrayList();
        europe.add(Poland);
        return europe;
    }
    public List asia(){
        Country country = new Country();
        BigDecimal China = country.getPeopleQuantity().add(BigDecimal.valueOf(66546846));
        List<BigDecimal> asia = new ArrayList();
        asia.add(China);
        return asia;

    }
}
