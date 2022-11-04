package com.capgemini;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Empleado2Test {
    Empleado e = new Empleado();
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
}
