package com.victoralfonsoulloa.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test for simple Addition")
    void testAdd() {
        assertEquals(4, calculator.add(1,2), "Simple addition");
        assertEquals(-2, calculator.add(-4,2), "Adds a negative number");
    }

    @Test
    @DisplayName("Test for simple Subtraction")
    void testSubtract() {
        assertEquals(2, calculator.subtract(4,2), "Four minus two");
        assertEquals(4, calculator.subtract(5,1), "Five minus one");
    }

    @Test
    @DisplayName("Test for simple Division")
    void testDivide() {
        assertEquals(2, calculator.divide(6,3), "6/3");
        assertEquals(5, calculator.divide(5,1), "5/1");
    }
    @Test
    @DisplayName("Division by zero should throw an ArithmeticException")
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

}
