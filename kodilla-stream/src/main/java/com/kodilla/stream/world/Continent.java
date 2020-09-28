package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public class Continent {
    BigDecimal countryPeopleQuantity = new Country().getPeopleQuantity();
    Map<String, BigDecimal> country = new HashMap<>();
    Map<String, String> countryPerContinentList = new HashMap<>();

    public Map CountryList() {
        country.put("Poland", countryPeopleQuantity);




        countryPerContinentList.put("Europe", "Poland");
        return countryPerContinentList;
    }


}
