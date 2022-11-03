package com.capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JefeTest {

    Jefe j = new Jefe();

    @BeforeEach
    public void setup(){
        this.j = new Jefe();
    }

    @Test

    public void testJefeSinParametros(){
        assertEquals("", this.j.getNombre());
        assertEquals("", this.j.getApellidos());
        assertEquals("", this.j.getDni());
        assertEquals("", this.j.getTlf());
        assertEquals(0.0, this.j.getSueldo());
        assertEquals("", this.j.getCargo());
        assertEquals("", this.j.departamento);
        assertEquals(0, this.j.numEmpleados);


    }

    @Test

    public void testJefeConParametros(){
        Jefe j = new Jefe("Alba", "Martin", "25789356R","678990023", 1500.0,"Tester", "Testing", 25 );
        assertEquals("Alba", j.getNombre());
        assertEquals("Martin", j.getApellidos());
        assertEquals("25789356R", j.getDni());
        assertEquals("678990023", j.getTlf());
        assertEquals(1500.0, j.getSueldo());
        assertEquals("Tester", j.getCargo());
        assertEquals("Testing", j.departamento);
        assertEquals(25, j.numEmpleados);

    }

    @Test

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

    @Test

    public void testToStringJefe(){

        Jefe j = new Jefe("Alba", "Martin", "25789356R","678990023", 1500.0,"Tester", "Testing", 25 );
        assertEquals("Jefe{nombre=Alba, apellidos=Martin, dni=25789356R, tlf=678990023, departamento='Testing', numEmpleados=25, sueldo=1500.0, cargo='Tester'}", j.toString());
    }
}
