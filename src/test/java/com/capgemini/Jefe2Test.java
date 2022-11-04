package com.capgemini;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Jefe2Test {
    Jefe j = new Jefe();
    @Test
    @DisplayName("Deberia cambiar los valores por los nuevos")
    public void testSetterAndGetterJefe(){
        this.j.setNombre("Maria");
        this.j.setApellidos("Lopez");
        this.j.setDni("34567894T");
        this.j.setTlf("765489022");
        this.j.setSueldo(1200.0);
        this.j.setCargo("Desarrollador");
        this.j.setDepartamento("Microsoft");
        this.j.setNumEmpleados(50);
        assertEquals("Maria", this.j.getNombre());
        assertEquals("Lopez", this.j.getApellidos());
        assertEquals("34567894T", this.j.getDni());
        assertEquals("765489022", this.j.getTlf());
        assertEquals(1200.0, this.j.getSueldo());
        assertEquals("Desarrollador", this.j.getCargo());
        assertEquals("Microsoft", this.j.departamento);
        assertEquals(50, this.j.numEmpleados);
    }
}
