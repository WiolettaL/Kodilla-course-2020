package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    private PizzaOrder theOrder = new BasicPizzaOrder();

    @Test
    public void testPizzaOrderWithIngredientsGetCost() {

        //Given
        theOrder = new ExtraCheesePizzaOrderDecorator(theOrder);
        theOrder = new PepperoniPizzaOrderDecorator(theOrder);
        theOrder = new HamPizzaOrderDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(theCost, new BigDecimal(24));
    }

    @Test
    public void testPizzaOrderWithIngredientsGetDescription() {

        //Given
        theOrder = new ExtraCheesePizzaOrderDecorator(theOrder);
        theOrder = new PepperoniPizzaOrderDecorator(theOrder);
        theOrder = new HamPizzaOrderDecorator(theOrder);

        //When
        String theDescription = theOrder.getIngredients();

        //Then
        assertEquals(theDescription, "Ingredients: cheese, basil, tomato sauce, extra cheese, pepperoni, parma ham");
    }
}
