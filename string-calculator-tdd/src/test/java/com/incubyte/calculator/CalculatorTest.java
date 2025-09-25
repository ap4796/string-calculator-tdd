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

    @Test
    void newlineDelimiterReturnsSum() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.add("1\n2,3")); // 1+2+3=6
    }

    @Test
    void customDelimiterReturnsSum() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add("//;\n1;2")); // custom delimiter ";" → sum = 3
    }

    @Test
    void negativeNumbersThrowsException(){
        Calculator calculator = new Calculator();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.add("1,-2,3")
        );
        assertEquals("negative numbers not allowed: -2", exception.getMessage());
    }

    @Test
    void multipleNegativeNumbersThrowException() {
        Calculator calculator = new Calculator();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.add("1,-2,3,-4")
        );
        assertEquals("negative numbers not allowed: -2,-4", exception.getMessage());
    }

}
