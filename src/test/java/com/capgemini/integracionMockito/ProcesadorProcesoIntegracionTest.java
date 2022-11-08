package com.capgemini.integracionMockito;

import com.capgemini.integracionMockito.Procesador;
import com.capgemini.integracionMockito.Proceso;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ProcesadorProcesoIntegracionTest {


    @Test
    public void testIntegracionProcesador(){
        //Creo un objeto simulado
        Proceso  proceso = spy(new Proceso());
        Procesador procesador = new Procesador("", proceso);
        /*
        Procesador procesador = new Procesador();
        procesador.setProceso(proceso);
        */
        String nombre = "nombre_proceso";
        //Me aseguro de que me devuelva lo que necesito de forma correcta, para eso uso when
        when(proceso.getNombre()).thenReturn(nombre);
        //Llamo al metodo que quiero mockear
        procesador.llamaProceso();
        //Lo verifico
        verify(proceso).getNombre();
        //Aseguro que sale lo mismo
        assertEquals("nombre_proceso-i", procesador.getComando());



    }
}
