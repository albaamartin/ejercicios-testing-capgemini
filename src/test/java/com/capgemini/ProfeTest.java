package com.capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
@Tag("unit")
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



}
