package com.capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("unit")
public class AulaTest {

    Aula a = new Aula();
    @BeforeEach
    public void setup(){
        this.a = new Aula();
    }

    @Test
    @DisplayName("Debería estar vacio")
    public void testAulaSinParametros(){
        assertEquals("", this.a.getDimension());
        assertEquals(true, this.a.isAireAcondicionado());
        assertEquals("", this.a.getProfesorAsignado());
    }

    @Test
    @DisplayName("Debería insertar los valores dados")
    public void testAulaConParametros(){
        Aula a = new Aula("18m2", true, "David");
        assertEquals("18m2", a.getDimension());
        assertEquals(true, a.isAireAcondicionado());
        assertEquals("David", a.getProfesorAsignado());

    }



    @Test
    @DisplayName("profesorAsignado= David, dimension= 18m2, con aire acondicionado")
    public void testToStringAula(){

        Aula a = new Aula("18m2", true, "David");
        assertEquals("profesorAsignado= David, dimension= 18m2, con aire acondicionado", a.toString());
    }
}
