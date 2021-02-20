package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalOnionDecorator extends AbstractPizzaOrderDecorator{
    public AdditionalOnionDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal("2.0")) ;
    }

    @Override
    public String addIngredient() {
        return super.addIngredient() + " + onion";
    }
}
