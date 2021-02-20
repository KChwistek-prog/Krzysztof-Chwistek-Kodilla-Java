package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class StandardPizza implements PizzaOrder{

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("15.00");
    }

    @Override
    public String addIngredient() {
        return "Sauce, cheese";
    }
}
