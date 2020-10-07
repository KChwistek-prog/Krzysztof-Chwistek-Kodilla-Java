package com.kodilla.stream.world;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent();
        Continent asia = new Continent();
        World world = new World();
        Country poland = new Country();
        Country russia = new Country();
        poland.setPeopleQuantity(new BigDecimal("2367354763"));
        russia.setPeopleQuantity(new BigDecimal("14379748874"));

        europe.addCountry(poland);
        asia.addCountry(russia);

        world.addContinentToEarth(europe);
        world.addContinentToEarth(asia);
        world.getPeopleQuantity(world.getEarth());

        //When
        BigDecimal expected = new BigDecimal("16747103637");
        BigDecimal result = world.getPeopleQuantity(world.getEarth());
        //Then
        Assertions.assertEquals(expected, result);
    }
}
