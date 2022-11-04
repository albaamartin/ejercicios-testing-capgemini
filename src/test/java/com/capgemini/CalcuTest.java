package com.capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcuTest {

    Calculadora c=null;

    @BeforeEach

    public void setup(){

        this.c= new Calculadora();
    }
    @Test
    @DisplayName("1+2=3")
    public void testSuma(){
        Float resultado = Calcu.suma(1F,2F);
        assertEquals(3.0F, resultado);
    }
    @Test
    @DisplayName("2.5-2.5=0")
    public void testResta(){
        Float resultado = Calcu.resta(2.5F,2.5F);
        assertEquals(0.0F, resultado);
    }
    @Test
    @DisplayName("2.5*2.5=6.25")
    public void testMulti(){
        Float resultado = Calcu.multi(2.5F,2.5F);
        assertEquals(6.25F, resultado);
    }

    @Test
    @DisplayName("2.5/2.5=1")
    public void testDivi(){
        Float resultado = Calcu.divi(2.5F,2.5F);
        assertEquals(1.0F, resultado);
    }
}
