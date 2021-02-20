package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaDecoratorTestSuite {

    @Test
    public void StandardPizzaCost(){
        //given
        StandardPizza standardPizza = new StandardPizza();

        //when
        BigDecimal pizzaCost = standardPizza.getCost();

        //then
        assertEquals(new BigDecimal("15.00"), pizzaCost);
    }

    @Test
    public void StandardPizzaDescritpion(){
        //given
        StandardPizza standardPizza = new StandardPizza();

        //when
        String pizzaDescription = standardPizza.getIngredient();

        //then
        assertEquals("Sauce, cheese", pizzaDescription);
    }

    @Test
    public void TestCheeseCost(){
        //given
        PizzaOrder pizzaOrder = new StandardPizza();
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);

        //when
        BigDecimal pizzaCost = pizzaOrder.getCost();

        //then
        assertEquals(new BigDecimal("18.00"), pizzaCost);
    }

    @Test
    public void TestCheeseDescription(){
        //given
        PizzaOrder pizzaOrder = new StandardPizza();
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);

        //when
        String description = pizzaOrder.getIngredient();

        //then
        assertEquals("Sauce, cheese + cheese", description);
    }

    @Test
    public void TestAddOnionCost(){
        //given
        PizzaOrder pizzaOrder = new StandardPizza();
        pizzaOrder = new AdditionalOnionDecorator(pizzaOrder);

        //when
        BigDecimal cost = pizzaOrder.getCost();

        //then
        assertEquals(new BigDecimal("17.00"), cost);
    }

    @Test
    public void TestAddOnionDescription(){
        //given
        PizzaOrder pizzaOrder = new StandardPizza();
        pizzaOrder = new AdditionalOnionDecorator(pizzaOrder);

        // when
        String description = pizzaOrder.getIngredient();

        //then
        assertEquals("Sauce, cheese + onion", description);
    }

    @Test
    public void TestAddGarlicDescription(){
        //given
        PizzaOrder pizzaOrder = new StandardPizza();
        pizzaOrder = new AdditionalGarlicDecorator(pizzaOrder);

        //when
        String description = pizzaOrder.getIngredient();

        //then
        assertEquals("Sauce, cheese + garlic", description);
    }

    @Test
    public void TestAddGarlicCost(){
        //given
        PizzaOrder pizzaOrder = new StandardPizza();
        pizzaOrder = new AdditionalGarlicDecorator(pizzaOrder);

        //when
        BigDecimal cost = pizzaOrder.getCost();

        //then
        assertEquals(new BigDecimal("16.50"), cost);
    }

    @Test
    public void TestAddIngredientsCost(){
        //given
        PizzaOrder pizzaOrder = new StandardPizza();
        pizzaOrder = new AdditionalGarlicDecorator(pizzaOrder);
        pizzaOrder = new AdditionalOnionDecorator(pizzaOrder);
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);

        //when
        BigDecimal cost = pizzaOrder.getCost();

        //then
        assertEquals(new BigDecimal("21.50"), cost);
    }

    @Test
    public void TestAddIngredientsDescription(){
        //given
        PizzaOrder pizzaOrder = new StandardPizza();
        pizzaOrder = new AdditionalGarlicDecorator(pizzaOrder);
        pizzaOrder = new AdditionalOnionDecorator(pizzaOrder);
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);

        //when
        String description = pizzaOrder.getIngredient();

        //then
        assertEquals("Sauce, cheese + garlic + onion + cheese", description);

    }
}
