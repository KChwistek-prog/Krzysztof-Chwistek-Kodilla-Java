package com.kodilla.spring.calculator;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculations() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double addResult = calculator.add(4, 3);
        double subResult = calculator.sub(4, 3);
        double mulResult = calculator.mul(4, 3);
        double divResult = calculator.div(4, 2);

        //then
        assertEquals(7, addResult);
        assertEquals(1, subResult);
        assertEquals(12, mulResult);
        assertEquals(2, divResult);

    }
}
