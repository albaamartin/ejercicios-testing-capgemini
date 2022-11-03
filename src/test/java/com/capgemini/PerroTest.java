package com.capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerroTest {

    Perro p = new Perro();

    @BeforeEach
    public void setup(){
        this.p = new Perro();
    }

    @Test

    public void testPerroSinParametros(){
        //Perro p = new Perro();
        assertEquals("", this.p.raza);
    }

    @Test

    public void testPerroConParametros(){
        Perro p = new Perro("Pastor Aleman");
        assertEquals("Pastor Aleman", p.raza);
    }

    @Test

    public void testSetterAndGetterPerro(){
        //Perro p = new Perro();
        this.p.setRaza("Labrador");
        assertEquals("Labrador", this.p.getRaza(), "El nombre debe ser igual al asignado por el setter");
    }
}
