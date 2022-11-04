package com.capgemini;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Aula2Test {
    Aula a = new Aula();
    @Test
    @DisplayName("Debería cambiar los valores a los nuevos")
    public void testSetterAndGetterAula(){
        this.a.setDimension("20m2");
        this.a.setAireAcondicionado(false);
        this.a.setProfesorAsignado("Javier");
        assertEquals("20m2", this.a.getDimension(), "El nombre debe ser igual al asignado por el setter");
        assertEquals(false, this.a.isAireAcondicionado(), "El nombre debe ser igual al asignado por el setter");
        assertEquals("Javier", this.a.getProfesorAsignado(), "El nombre debe ser igual al asignado por el setter");
    }
}
