package com.capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
@Tag("unit")
public class PersonaTest {

    Persona p = new Persona();

    @BeforeEach
    public void setup(){
        this.p = new Persona();
    }

    @Test
    @DisplayName("Debería estar vacio")
    public void testPersonaSinParametros(){
        assertEquals("", this.p.getNombre());
        assertEquals("", this.p.getApellidos());
        assertEquals("", this.p.getDni());
        assertEquals("", this.p.getTlf());
    }

    @Test
    @DisplayName("Deberia insertar los valores dados")
    public void testPersonaConParametros(){
        Persona p = new Persona("Alba", "Martin", "25789356R","678990023");
        assertEquals("Alba", p.getNombre());
        assertEquals("Martin", p.getApellidos());
        assertEquals("25789356R", p.getDni());
        assertEquals("678990023", p.getTlf());

    }



    @Test
    @DisplayName("Persona{nombre='Maria', apellidos='Lopez', dni='34567894T', tlf='765489022'}")
    public void testToStringPersona(){

        Persona p = new Persona("Maria","Lopez","34567894T", "765489022");
        assertEquals("Persona{nombre='Maria', apellidos='Lopez', dni='34567894T', tlf='765489022'}", p.toString());
    }
}
