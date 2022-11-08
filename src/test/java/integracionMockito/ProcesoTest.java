package integracionMockito;

import com.capgemini.integracionMockito.Proceso;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProcesoTest {
    Proceso proceso = new Proceso();

    @BeforeEach
    public void setup(){
        proceso = new Proceso();
    }
    @Test

    public void testProcesadorSinParametros(){

        assertNotNull(proceso.getNombre());
        assertEquals("", proceso.getNombre());

    }

    @Test

    public void testProcesadorConParametros(){
        Proceso p = new Proceso("nombre");
        assertNotNull(p.getNombre());
        assertEquals("nombre", p.getNombre());
    }

    @Test
    public void testSetterAndGetterProcesador() {
        this.proceso.setNombre("N");
        assertEquals("N", this.proceso.getNombre());
    }

    @Test
    public void testToStringProcesador(){
        Proceso p = new Proceso("Automatizacion");
        assertEquals("proceso{nombre='Automatizacion'}", p.toString() );
    }

}
