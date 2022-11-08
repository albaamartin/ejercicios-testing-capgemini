package com.capgemini.integracionMockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ControladorTest {

    private Controlador c;
    @BeforeEach
    public void setup(){

        c = new Controlador();
    }


    @Test
    public void testControladorConstructor() {
        assertNotNull(c.getModelo());
    }
    @Test
    public void testSetterAndGetterApp() {

        Modelo m=new Modelo();
        ArrayList<String> list= new ArrayList<>();
        this.c.setDatos(list);
        this.c.setModelo(m);
        assertEquals(m,c.getModelo());
        assertEquals(m,c.getDatos());
    }
    @Test
    public void testLista(){
        c.Lista();
        assertNotNull(c.getDatos());
    }
}
