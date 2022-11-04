package com.capgemini;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
@Tag("unit")
public class ClientePrivadoTest {

    //@BeforeAll before todos los tests

    //@BeforeEach Para inicializar las pruebas, before de cada test

    //@AfterEach //after de cada test

    //@AfterAll //after todos los tests


    @Test

    public void pruebaSinParametros(){
        ClientePrivado c = new ClientePrivado();
        assertEquals(0, c.getEdad());
        assertEquals("", c.getNombre());
        assertEquals("", c.getDireccion());
    }

    @Test

    public void PruebaConParametros() {
        ClientePrivado c = new ClientePrivado("Ana", "Sevilla", 24);
        assertEquals(24, c.getEdad());
        assertEquals("Ana", c.getNombre());
        assertEquals("Sevilla", c.getDireccion());
    }

    @Test

    public void checkSetterAndGetterNombre(){
        ClientePrivado c = new ClientePrivado();
        c.setNombre("Pepe");
        assertEquals("Pepe", c.getNombre(), "El nombre debe ser igual al asignado por el setter");
    }
}
