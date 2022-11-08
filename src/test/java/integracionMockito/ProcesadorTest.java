package integracionMockito;

import com.capgemini.integracionMockito.Procesador;
import com.capgemini.integracionMockito.Proceso;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcesadorTest {

    Procesador procesador = new Procesador();

    @BeforeEach
    public void setup(){
        procesador = new Procesador();
    }

    @Test
    public void testProcesadorSinParametros(){
        assertNotNull(procesador.getComando());
        assertNotNull(procesador.getProceso());
        assertEquals("", procesador.getComando());
        //assertEquals("", procesador.getProceso().getNombre());
    }
    @Test
    public void testProcesadorConParametros(){
        Proceso proceso = new Proceso();
        Procesador p = new Procesador("Nombre", proceso);
        assertNotNull(p.getComando());
        assertEquals("Nombre", p.getComando());
    }
    @Test
    public void testSetterAndGetterProcesador() {
        Proceso proceso = new Proceso();
        procesador.setProceso(proceso);
        assertEquals(proceso, procesador.getProceso());
    }

}
