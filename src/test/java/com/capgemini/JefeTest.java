package com.capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
@Tag("unit")
public class JefeTest {

    Jefe j = new Jefe();

    @BeforeEach
    public void setup(){
        this.j = new Jefe();
    }

    @Test
    @DisplayName("Deberia estar vacio")
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
    @DisplayName("Deberia insertar los valores dados")
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
    @DisplayName("Jefe{nombre=Alba, apellidos=Martin, dni=25789356R, tlf=678990023, departamento='Testing', numEmpleados=25, sueldo=1500.0, cargo='Tester'}")
    public void testToStringJefe(){

        Jefe j = new Jefe("Alba", "Martin", "25789356R","678990023", 1500.0,"Tester", "Testing", 25 );
        assertEquals("Jefe{nombre=Alba, apellidos=Martin, dni=25789356R, tlf=678990023, departamento='Testing', numEmpleados=25, sueldo=1500.0, cargo='Tester'}", j.toString());
    }
}
