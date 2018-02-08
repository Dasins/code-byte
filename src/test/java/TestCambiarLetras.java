import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * La clase test de la clase CambiarLetras.
 *
 * @author  D4s1ns
 * @version 2018/02/08
 */
public class TestCambiarLetras {
    @Test 
    public void testCambiarLetras() {
        CambiarLetras objetoBase = new CambiarLetras(); 
        String origen = "Mio es el mundo: como el aire libre,"; 
        assertEquals("Njp ft fm nvOEp: dpnp fm bjsf mjcsf,",objetoBase.cambiarLetras(origen)); 
        origen = "OtroZ trabajan pozque cOmA yo;";
        assertEquals("PUspA UsbcbkbO qpArvf dPnB zp;",objetoBase.cambiarLetras(origen)); 
    }
}