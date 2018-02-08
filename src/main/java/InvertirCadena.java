
/**
 * Clase que modela objetos capaces de devolver una cadena inversa, 
 * a la cadena dada por parametro.
 *
 * @author D4s1ns
 * @version 2018/02/08
 */
public class InvertirCadena{
    public String invertirCadena(String cadena) {
        String cadenaInvertida = "";   
        for(int i = 0; i < cadena.length(); i++) {
            cadenaInvertida = cadena.substring(i, i + 1) + cadenaInvertida; 
        }     
        return cadenaInvertida;    
  } 
}
