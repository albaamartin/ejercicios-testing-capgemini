package com.capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AulaTest {

    Aula a = new Aula();

    @BeforeEach
    public void setup(){
        this.a = new Aula();
    }

    @Test

    public void testAulaSinParametros(){
        assertEquals("", this.a.getDimension());
        assertEquals(true, this.a.isAireAcondicionado());
        assertEquals("", this.a.getProfesorAsignado());
    }

    @Test

    public void testAulaConParametros(){
        Aula a = new Aula("18m2", true, "David");
        assertEquals("18m2", a.getDimension());
        assertEquals(true, a.isAireAcondicionado());
        assertEquals("David", a.getProfesorAsignado());

    }

    @Test

    public void testSetterAndGetterAula(){
        this.a.setDimension("20m2");
        this.a.setAireAcondicionado(false);
        this.a.setProfesorAsignado("Javier");
        assertEquals("20m2", this.a.getDimension(), "El nombre debe ser igual al asignado por el setter");
        assertEquals(false, this.a.isAireAcondicionado(), "El nombre debe ser igual al asignado por el setter");
        assertEquals("Javier", this.a.getProfesorAsignado(), "El nombre debe ser igual al asignado por el setter");
    }

    @Test

    public void testToStringAula(){

        Aula a = new Aula("18m2", true, "David");
        assertEquals("profesorAsignado= David, dimension= 18m2, con aire acondicionado", a.toString());
    }
}
