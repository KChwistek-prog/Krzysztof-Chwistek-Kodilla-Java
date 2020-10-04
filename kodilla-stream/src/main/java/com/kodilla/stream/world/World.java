package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class World {

    public List<List<BigDecimal>> world(){
        Continent continent = new Continent();
        List<List<BigDecimal>> continentList = new ArrayList<>();
        continentList.add(continent.asia());
        continentList.add(continent.europe());
        return continentList;
    }
    public BigDecimal getPeopleQuantity() {
        World world = new World();
        Country country = new Country();
        BigDecimal population = world.world().stream()
                .flatMap(Collection::stream)
                .map(country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return population;
    }
}