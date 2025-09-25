package com.incubyte.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void emptyStringReturnsZero(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    void singleNumberReturnsValue(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add("2"));
    }

    @Test
    void twoNumbersCommaSeparatedReturnSum(){
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.add("1,5"));
    }

    @Test
    void multipleNumbersCommaSeparatedReturnSum(){
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add("1,2,3,4"));
    }
}
