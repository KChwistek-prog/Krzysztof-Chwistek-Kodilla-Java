package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalGarlicDecorator extends AbstractPizzaOrderDecorator{

    public AdditionalGarlicDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal("1.5"));
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + " + garlic";
    }
}
