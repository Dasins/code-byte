import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * La clase test de la clase InvertirCadena.
 *
 * @author  D4s1ns
 * @version 2018/02/08
 */
public class TestInvertirCadena {
    @Test 
    public void testInvertirCadena() {
        InvertirCadena objetoBase = new InvertirCadena(); 
        String origen = "Cuan solitaria la nacion que un dia"; 
        assertEquals("aid nu euq noican al airatilos nauC",objetoBase.invertirCadena(origen)); 
        origen = "PoBlAra inmensa GeNTe";
        assertEquals("eTNeG asnemni arAlBoP",objetoBase.invertirCadena(origen)); 
        origen = "LA NACION CUYO IMPERIO SE EXTENDIA";
        assertEquals("AIDNETXE ES OIREPMI OYUC NOICAN AL",objetoBase.invertirCadena(origen));
        origen = "del ocaso al oriente   ";
        assertEquals("   etneiro la osaco led",objetoBase.invertirCadena(origen));
    }
}