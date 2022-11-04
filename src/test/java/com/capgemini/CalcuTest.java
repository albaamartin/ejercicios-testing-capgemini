package com.capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcuTest {

    Calcu c= new Calcu();

    @BeforeEach

    public void setup(){

        this.c= new Calcu();
    }
    @Test
    @DisplayName("1+2=3")
    public void testSuma(){
        Float resultado = Calcu.suma(1F,2F);
        assertEquals(3.0F, resultado);
    }

    @ParameterizedTest //Cuando es @ParameterizedTest no puede ser @Test
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void restaCSVFile(Float first, Float second, Float expected){
        assertEquals(expected, this.c.resta(first,second),
                () -> first + " - " + second + " should equal " + expected);
    }

    @ParameterizedTest
    @CsvSource({
            "2.5 , 2.5 , 0",
            "6.0 , 3.0 , 3.0",
            "10.5 , 5.5 , 5.0"
    })
    void restaCSV(Float first, Float second, Float expected){
        assertEquals(expected, this.c.resta(first,second),
                () -> first + " - " + second + " should equal " + expected);
    }

    @RepeatedTest(5)
    public void testRepeticionResta(){
        Float resultado = Calcu.resta(2.5F,2.5F);
        assertEquals(0.0F, resultado);
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
