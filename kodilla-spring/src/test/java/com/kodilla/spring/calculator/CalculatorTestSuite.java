package com.kodilla.spring.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = applicationContext.getBean(Calculator.class);

        double numA = 11.5;
        double numB = 3.5;

        //When
        double sumResult = calculator.add(numA, numB);
        double subResult = calculator.sub(numA, numB);
        double mulResult = calculator.mul(numA, numB);
        double divResult = calculator.div(numA, numB);

        //Then
        assertEquals(15, sumResult,1);
        assertEquals(8, subResult,1);
        assertEquals(40.25, mulResult,1);
        assertEquals(3.28571429, divResult,1);

    }

}
