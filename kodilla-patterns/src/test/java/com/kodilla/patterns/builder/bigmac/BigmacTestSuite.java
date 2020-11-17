package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    void testNewBigmac(){
        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sezam")
                .burgers(2)
                .sauce("standard")
                .ingredients("onion")
                .ingredients("cheese")
                .build();
        System.out.println(bigmac);

        //When
        int ingredients = bigmac.getIngredients().size();
        //Then
        assertEquals(2, ingredients);
    }
}
