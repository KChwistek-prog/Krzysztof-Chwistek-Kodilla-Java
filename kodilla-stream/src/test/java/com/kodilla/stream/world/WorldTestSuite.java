package com.kodilla.stream.world;
import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        //When
        BigDecimal expected = new BigDecimal("102338705088");
        BigDecimal result = world.getPeopleQuantity();
        //Then
        Assertions.assertEquals(expected, result);
    }
}
