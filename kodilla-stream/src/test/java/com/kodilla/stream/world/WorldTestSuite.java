package com.kodilla.stream.world;
import java.math.BigDecimal;

import org.junit.Test;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        Continent eu = new Continent();
        System.out.println(eu.europe());
        System.out.println(eu.france);

        World wr = new World();

        System.out.println(wr.world());
        wr.getPeopleQuantity();
        //testGetPeopleQuantity();
    }
}
