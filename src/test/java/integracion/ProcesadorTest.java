package integracion;

import com.capgemini.integracion.Procesador;
import com.capgemini.integracion.Proceso;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcesadorTest {

    Procesador p = new Procesador();

    @BeforeEach
    public void setup(){
        this.p = new Procesador();
    }

    @Test
    public void testProcesador(){
        assertNotNull(p.getProceso());
    }

    @Test
    public void testSetterAndGetterProcesador() {
        Proceso proceso = new Proceso();
        p.setProceso(proceso);
        assertEquals(proceso, p.getProceso());
    }

}
