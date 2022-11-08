package integracion;

import com.capgemini.integracion.Procesador;
import com.capgemini.integracion.Proceso;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcesoTest {
    Proceso p = new Proceso();

    @BeforeEach
    public void setup(){
        this.p = new Proceso();
    }
    @Test

    public void testProcesadorSinParametros(){

        assertEquals("", p.getNombre());

    }

    @Test

    public void testProcesadorConParametros(){
        Proceso p = new Proceso("Nombre");
        assertEquals("Nombre", p.getNombre());
    }

    @Test
    public void testSetterAndGetterProcesador() {
        this.p.setNombre("N");
        assertEquals("N", this.p.getNombre());
    }

    @Test
    public void testToStringProcesador(){
        Proceso p = new Proceso("Automatizacion");
        assertEquals("proceso{nombre='Automatizacion'}", p.toString() );
    }
}
