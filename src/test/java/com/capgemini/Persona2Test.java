package com.capgemini;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Persona2Test {
    Persona p = new Persona();
    @Test
    @DisplayName("Deberia cambiar los valores por los nuevos")
    public void testSetterAndGetterPersona(){
        this.p.setNombre("Maria");
        this.p.setApellidos("Lopez");
        this.p.setDni("34567894T");
        this.p.setTlf("765489022");
        assertEquals("Maria", this.p.getNombre());
        assertEquals("Lopez", this.p.getApellidos());
        assertEquals("34567894T", this.p.getDni());
        assertEquals("765489022", this.p.getTlf());
    }
}
