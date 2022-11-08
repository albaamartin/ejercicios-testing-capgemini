package integracion;

import com.capgemini.integracion.Procesador;
import com.capgemini.integracion.Proceso;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class ProcesadorProcesoIntegracionTest {

    private Procesador p;

    @BeforeEach
    public void setup(){
        p = new Procesador();
    }

    @Test
    public void testProcesador(){
        //Creo un objeto simulado
        Proceso  procesoMockeado = spy(p.getProceso());
        //Asigno el objeto al objeto del procesador
        p.setProceso(procesoMockeado);

    }
}
