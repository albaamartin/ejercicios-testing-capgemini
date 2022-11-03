package com.capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurritoTest {

    Currito c = new Currito();

    @BeforeEach
    public void setup(){
        this.c = new Currito();
    }

    @Test

    public void testJefeSinParametros(){
        assertEquals("", this.c.getNombre());
        assertEquals("", this.c.getApellidos());
        assertEquals("", this.c.getDni());
        assertEquals("", this.c.getTlf());
        assertEquals(0.0, this.c.getSueldo());
        assertEquals("", this.c.getCargo());
        assertEquals("", this.c.proyecto);



    }

    @Test

    public void testCurritoConParametros(){
        Currito c = new Currito("Alba", "Martin", "25789356R","678990023", 1500.0,"Tester", "BBVA");
        assertEquals("Alba", c.getNombre());
        assertEquals("Martin", c.getApellidos());
        assertEquals("25789356R", c.getDni());
        assertEquals("678990023", c.getTlf());
        assertEquals(1500.0, c.getSueldo());
        assertEquals("Tester", c.getCargo());
        assertEquals("BBVA", c.proyecto);

    }

    @Test

    public void testSetterAndGetterCurrito(){
        this.c.setNombre("Maria");
        this.c.setApellidos("Lopez");
        this.c.setDni("34567894T");
        this.c.setTlf("765489022");
        this.c.setSueldo(1200.0);
        this.c.setCargo("Desarrollador");
        this.c.setProyecto("Openbank");
        assertEquals("Maria", this.c.getNombre());
        assertEquals("Lopez", this.c.getApellidos());
        assertEquals("34567894T", this.c.getDni());
        assertEquals("765489022", this.c.getTlf());
        assertEquals(1200.0, this.c.getSueldo());
        assertEquals("Desarrollador", this.c.getCargo());
        assertEquals("Openbank", this.c.proyecto);

    }

    @Test

    public void testToStringCurrito(){

        Currito c = new Currito("Alba", "Martin", "25789356R","678990023", 1500.0,"Tester", "BBVA");
        assertEquals("Currito{nombre=Alba, apellidos=Martin, dni=25789356R, tlf=678990023, sueldo=1500.0, cargo='Tester, proyecto=BBVA}", c.toString());
    }
}
