
/**
 * Clase que modela objetos capaces de sustituir cada letra de una palabra por 
 * aquella que la sigue en el alfabeto.
 * Hecha la transformacion, convierte todas las vocales en mayusculas.
 *
 * @author D4s1ns
 * @version 2018/02/08
 */
public class CambiarLetras {
    /**
     * Cambia las letras de una cadena por su siguiente en el alfabeto,
     * a continuacion convierte todas las vocales en mayusculas.
     * 
     * @param cadena La cadena a transformar.
     * @return Devuelve una cadena con las letras cambiadas por su siguiente en el alfabeto y las vocales en mayusculas.
     */
    public String cambiarLetras(String cadena) {
        String cadenaEncriptada = "";
        for(int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i) > 96 && cadena.charAt(i) < 122) {
                cadenaEncriptada += (char)(cadena.charAt(i) + 1);
            }
            else if(cadena.charAt(i) == 122) {
                cadenaEncriptada += (char)97;
            }
            else if(cadena.charAt(i) > 64 && cadena.charAt(i) < 90) {
                cadenaEncriptada += (char)(cadena.charAt(i) + 1);
            }
            else if(cadena.charAt(i) == 90) {
                cadenaEncriptada += (char)65;
            } 
            else {
                cadenaEncriptada += (char)cadena.charAt(i);
            }
	}
	cadenaEncriptada = cadenaEncriptada.replaceAll("a" ,"A").replaceAll("e", "E").replaceAll("i", "I").replaceAll("o","O").replaceAll("u", "U");
        return cadenaEncriptada;
    }
}
