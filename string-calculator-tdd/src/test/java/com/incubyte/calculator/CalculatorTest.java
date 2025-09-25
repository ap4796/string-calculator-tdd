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
}
