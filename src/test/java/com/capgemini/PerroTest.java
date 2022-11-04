package com.capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
@Tag("unit")
public class PerroTest {

    Perro p = new Perro();

    @BeforeEach
    public void setup(){
        this.p = new Perro();
    }

    @Test
    @DisplayName("Deberia estar vacio")
    public void testPerroSinParametros(){
        //Perro p = new Perro();
        assertEquals("", this.p.raza);
    }

    @Test
    @DisplayName("Deberia insertar los valores dados")
    public void testPerroConParametros(){
        Perro p = new Perro("Pastor Aleman");
        assertEquals("Pastor Aleman", p.raza);
    }


}
