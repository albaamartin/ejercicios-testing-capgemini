package com.capgemini.integracionMockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class ControladorModeloIntegracion {
    private Controlador c;
    private Modelo m;

    @BeforeEach
    public void setup(){
        c= new Controlador();
        m=spy(new Modelo());
        c.setModelo(m);
    }

    @Test
    public void testModel(){
        c.Lista();
        verify(m).Lista();
    }
}
