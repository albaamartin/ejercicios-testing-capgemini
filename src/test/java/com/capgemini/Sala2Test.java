package com.capgemini;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sala2Test {
    Sala s = new Sala();
    @Test
    @DisplayName("Deberia cambiar los valores por los nuevos")
    public void testSetterAndGetterSala(){
        this.s.setDimension("20m2");
        this.s.setAireAcondicionado(false);
        assertEquals("20m2", this.s.getDimension(), "El nombre debe ser igual al asignado por el setter");
        assertEquals(false, this.s.isAireAcondicionado(), "El nombre debe ser igual al asignado por el setter");
    }
}
