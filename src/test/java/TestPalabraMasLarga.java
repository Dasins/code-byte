import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * La clase test de PalabraMasLarga-
 *
 * @author  D4s1ns
 * @version 2018/02/08
 */
public class TestPalabraMasLarga {
    @Test 
    public void palabraMasLarga() 
    {
        // Failure message:  
        // Tu codigo no pasa los testsEjercicioR405 
      
        PalabraMasLarga objetoBase = new PalabraMasLarga(); 
        String origen = "La& no&&&&&che el cie&&&&&lo encubre"; 
        assertEquals("encubre",objetoBase.palabraMasLarga(origen)); 
        origen = "";
        assertNull(objetoBase.palabraMasLarga(origen)); 
        origen = "Y acallA manso el viento";
        assertEquals("acallA",objetoBase.palabraMasLarga(origen));
        origen = "Y el mar sin movimiento";
        assertEquals("movimiento",objetoBase.palabraMasLarga(origen));
        origen = "Tambien en calma esta";
        assertEquals("Tambien",objetoBase.palabraMasLarga(origen));
    }
}
