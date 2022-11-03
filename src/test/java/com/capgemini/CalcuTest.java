package com.capgemini;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcuTest {

    @Test

    public void testSuma(){
        Float resultado = Calcu.suma(1F,2F);
        assertEquals(3.0F, resultado);
    }
    @Test

    public void testResta(){
        Float resultado = Calcu.resta(2.5F,2.5F);
        assertEquals(0.0F, resultado);
    }
    @Test

    public void testMulti(){
        Float resultado = Calcu.multi(2.5F,2.5F);
        assertEquals(6.25F, resultado);
    }

    @Test

    public void testDivi(){
        Float resultado = Calcu.divi(2.5F,2.5F);
        assertEquals(1.0F, resultado);
    }
}
