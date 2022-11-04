package com.capgemini;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Perro2Test {
    Perro p = new Perro();
    @Test
    @DisplayName("Deberia cambiar los valores por los nuevos")
    public void testSetterAndGetterPerro(){
        //Perro p = new Perro();
        this.p.setRaza("Labrador");
        assertEquals("Labrador", this.p.getRaza(), "El nombre debe ser igual al asignado por el setter");
    }
}
