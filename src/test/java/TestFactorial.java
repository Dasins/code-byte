import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * La clase test de la clase Factorial.
 *
 * @author  D4s1ns
 * @version 2018/02/08
 */
public class TestFactorial {
    @Test 
    public void factorial() {
        Factorial objetoBase = new Factorial(); 
        int origen = 0; 
        assertEquals(1,objetoBase.factorial(origen)); 
        origen = 1;
        assertEquals(1,objetoBase.factorial(origen)); 
        origen = 2;
        assertEquals(2,objetoBase.factorial(origen));
        origen = 3;
        assertEquals(6,objetoBase.factorial(origen));
        origen = 4;
        assertEquals(24,objetoBase.factorial(origen));
        origen = 5;
        assertEquals(120,objetoBase.factorial(origen));
    }
}