package com.capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaTest {

    Sala s = new Sala();

    @BeforeEach
    public void setup(){
        this.s = new Sala();
    }

    @Test

    public void testSalaSinParametros(){
        assertEquals("", this.s.getDimension());
        assertEquals(true, this.s.isAireAcondicionado());
    }

    @Test

    public void testSalaConParametros(){
        Sala s = new Sala("18m2", true);
        assertEquals("18m2", s.getDimension());
        assertEquals(true, s.isAireAcondicionado());

    }

    @Test

    public void testSetterAndGetterSala(){
        this.s.setDimension("20m2");
        this.s.setAireAcondicionado(false);
        assertEquals("20m2", this.s.getDimension(), "El nombre debe ser igual al asignado por el setter");
        assertEquals(false, this.s.isAireAcondicionado(), "El nombre debe ser igual al asignado por el setter");
    }

    @Test

    public void testToStringSala(){
        Sala s = new Sala("18m2", true);
        assertEquals("dimension= 18m2, con aire acondicionado", s.toString());
    }
}
