package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaculatorTest {
    Caculator calc;

    @BeforeEach
    public void setup() {
        calc = new Caculator();
    }

    @Test
    public void testAdd_Success() {
        assertEquals(20, calc.add(16, 4));
    }

    @Test
    public void testAdd_Fail() {
        Exception ex = assertThrows(ArithmeticException.class, () -> calc.add(Integer.MAX_VALUE, 1));
        assertEquals("Number cannot be greater than or equal to the Integer.MAX_VALUE", ex.getMessage());
    }

    @Test
    public void testSub_Success() {
        assertEquals(12, calc.sub(16, 4));
    }

    @Test
    public void testMulti_Success() {
        assertEquals(64, calc.multi(16, 4));
    }

    @Test
    public void testDiv_Success() {
        assertEquals(4, calc.div(16, 4));
    }

}