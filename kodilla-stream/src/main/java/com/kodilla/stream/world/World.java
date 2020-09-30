package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public class World {
    Continent continent = new Continent();
    public void continentList(){
    List<List> continentList = new ArrayList<>();
    continentList.add(continent.europe());
    continentList.add(continent.asia());
   }
}