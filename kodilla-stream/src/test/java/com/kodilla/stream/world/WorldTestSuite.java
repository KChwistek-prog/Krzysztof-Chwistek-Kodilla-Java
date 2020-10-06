package com.kodilla.stream.world;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
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

        //When
        BigDecimal expected = new BigDecimal("102338705088");
        BigDecimal result = world.getPeopleQuantity(world.getEarth());
        //Then
        Assertions.assertEquals(expected, result);
    }
}
