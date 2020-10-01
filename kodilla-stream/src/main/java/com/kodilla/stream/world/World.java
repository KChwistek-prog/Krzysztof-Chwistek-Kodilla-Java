package com.kodilla.stream.world;

import java.util.*;

public class World {

    Continent continent = new Continent();

    public void getPeopleQuantity(){
    List<List> continentList = new ArrayList<>();
    continentList.add(continent.europe());
    continentList.add(continent.asia());

    }
}