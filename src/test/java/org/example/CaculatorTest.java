package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaculatorTest {
    Caculator calc;

    @BeforeEach
    public void setup()
    {
        calc = new Caculator();
    }

    @Test
    public void testAdd_Success()
    {
        assertEquals(20, calc.add(16, 4));
    }

    @Test
    public void testSub_Success()
    {
        assertEquals(12, calc.sub(16, 4));
    }

}
