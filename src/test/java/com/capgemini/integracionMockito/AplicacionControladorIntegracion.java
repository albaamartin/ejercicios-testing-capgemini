package com.capgemini.integracionMockito;

import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class AplicacionControladorIntegracion {

    private Aplicacion app;

    @BeforeEach
    public void setup(){
        app = new Aplicacion();
    }

    public void testControlador(){
        //Creo el objeto simulado
        Controlador controlador = spy(app.getControlador());
        //Asigno el objeto al objeto de la aplicacion
        app.setControlador(controlador);
        //Llamo al metodo que me da problemas, es decir, el que llama al metodo de otra clase, en este caso, main
        app.main();
        //Verificamos que se haya producido la llamada de forma correcta
        verify(controlador).Lista();
    }
}
