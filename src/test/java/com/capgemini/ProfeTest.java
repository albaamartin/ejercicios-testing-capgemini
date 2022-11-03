package com.capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfeTest {

    Profe p = new Profe();

    @BeforeEach
    public void setup(){
        this.p = new Profe();
    }

    @Test

    public void testProfeSinParametros(){
        assertEquals("", this.p.getNombre());
        assertEquals("", this.p.getApellidos());
        assertEquals("", this.p.getDni());
        assertEquals("", this.p.getTlf());
        assertEquals("", this.p.getAsignatura());

    }

    @Test

    public void testProfeConParametros(){
        Profe p = new Profe("Alba", "Martin", "25789356R","678990023", "Matematicas");
        assertEquals("Alba", p.getNombre());
        assertEquals("Martin", p.getApellidos());
        assertEquals("25789356R", p.getDni());
        assertEquals("678990023", p.getTlf());
        assertEquals("Matematicas", p.getAsignatura());

    }

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
