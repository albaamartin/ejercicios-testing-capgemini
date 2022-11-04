package com.capgemini;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Profe2Test {
    Profe p = new Profe();
    @Test
    public void testSetterAndGetterProfe(){
        this.p.setNombre("Maria");
        this.p.setApellidos("Lopez");
        this.p.setDni("34567894T");
        this.p.setTlf("765489022");
        this.p.setAsignatura("Biologia");
        assertEquals("Maria", this.p.getNombre());
        assertEquals("Lopez", this.p.getApellidos());
        assertEquals("34567894T", this.p.getDni());
        assertEquals("765489022", this.p.getTlf());
        assertEquals("Biologia", this.p.getAsignatura());
    }
}
