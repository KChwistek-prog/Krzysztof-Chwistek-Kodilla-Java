package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    public List<List> world(){
        Continent continent = new Continent();
        List<List> continentList = new ArrayList<>();
        continentList.add(continent.asia());
        continentList.add(continent.europe());
        return continentList;
    }
    public void getPeopleQuantity() {
        World world = new World();

            world.world().stream()
                    .flatMap(x -> x.stream())
                    .forEach(System.out::println);
                    //.reduce(BigDecimal.ZERO, (BigDecimal sum, BigDecimal current) -> sum = sum.add(current));

    }
}