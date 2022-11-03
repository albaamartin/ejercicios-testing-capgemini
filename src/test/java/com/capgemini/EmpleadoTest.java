package com.capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoTest {

    Empleado e = new Empleado();

    @BeforeEach
    public void setup(){
        this.e = new Empleado();
    }

    @Test

    public void testEmpleadoSinParametros(){
        assertEquals("", this.e.getNombre());
        assertEquals("", this.e.getApellidos());
        assertEquals("", this.e.getDni());
        assertEquals("", this.e.getTlf());
        assertEquals(0.0, this.e.getSueldo());
        assertEquals("", this.e.getCargo());


    }

    @Test

    public void testEmpleadoConParametros(){
        Empleado e = new Empleado("Alba", "Martin", "25789356R","678990023", 1500.0,"Tester" );
        assertEquals("Alba", e.getNombre());
        assertEquals("Martin", e.getApellidos());
        assertEquals("25789356R", e.getDni());
        assertEquals("678990023", e.getTlf());
        assertEquals(1500.0, e.getSueldo());
        assertEquals("Tester", e.getCargo());


    }

    @Test

    public void testSetterAndGetterEmpleado(){
        this.e.setNombre("Maria");
        this.e.setApellidos("Lopez");
        this.e.setDni("34567894T");
        this.e.setTlf("765489022");
        this.e.setSueldo(1200.0);
        this.e.setCargo("Desarrollador");
        assertEquals("Maria", this.e.getNombre());
        assertEquals("Lopez", this.e.getApellidos());
        assertEquals("34567894T", this.e.getDni());
        assertEquals("765489022", this.e.getTlf());
        assertEquals(1200.0, this.e.getSueldo());
        assertEquals("Desarrollador", this.e.getCargo());
    }

    @Test

    public void testToStringEmpleado(){

        Empleado e = new Empleado("Maria","Lopez","34567894T", "765489022", 1500.0, "Tester");
        assertEquals("Empleado{nombre=Maria, apellidos=Lopez, dni=34567894T, tlf=765489022, sueldo=1500.0, cargo='Tester'}", e.toString());
    }
}
