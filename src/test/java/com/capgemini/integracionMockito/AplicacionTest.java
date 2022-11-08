package com.capgemini.integracionMockito;

import com.capgemini.integracionMockito.Aplicacion;
import com.capgemini.integracionMockito.Controlador;
import com.capgemini.integracionMockito.Modelo;
import com.capgemini.integracionMockito.Proceso;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AplicacionTest {

    private Aplicacion app;
    @BeforeEach
    public void setup(){

        app = new Aplicacion();
    }


    @Test
    public void testAppConstructor() {
        assertNotNull(app.getControlador());
    }
    @Test
    public void testSetterAndGetterApp() {

        Controlador c = new Controlador();
        this.app.setControlador(c);
        assertEquals(c,app.getControlador());
    }

}
