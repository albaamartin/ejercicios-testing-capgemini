package com.capgemini;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
@Tag("unit")
public class ClienteTest {
    @Test

    public void pruebaSinParametros(){
        Cliente c = new Cliente();
        assertEquals(0, c.edad);
        assertEquals("", c.nombre);
        assertEquals("", c.direccion);
    }

    @Test

    public void PruebaConParametros(){
        Cliente c = new Cliente("Ana", "Sevilla", 24);
        assertEquals(24, c.edad);
        assertEquals("Ana", c.nombre);
        assertEquals("Sevilla", c.direccion);
    }
}
