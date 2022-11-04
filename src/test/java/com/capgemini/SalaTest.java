package com.capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
@Tag("unit")
public class SalaTest {

    Sala s = new Sala();

    @BeforeEach
    public void setup(){
        this.s = new Sala();
    }

    @Test
    @DisplayName("Deberia estar vacio")
    public void testSalaSinParametros(){
        assertEquals("", this.s.getDimension());
        assertEquals(true, this.s.isAireAcondicionado());
    }

    @Test
    @DisplayName("Deberia insertar los valores dados")
    public void testSalaConParametros(){
        Sala s = new Sala("18m2", true);
        assertEquals("18m2", s.getDimension());
        assertEquals(true, s.isAireAcondicionado());

    }



    @Test
    @DisplayName("dimension= 18m2, con aire acondicionado")
    public void testToStringSala(){
        Sala s = new Sala("18m2", true);
        assertEquals("dimension= 18m2, con aire acondicionado", s.toString());
    }
}
