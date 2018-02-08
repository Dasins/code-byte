
/**
 * Esta clase modela objetos capaces de buscar la palabra mas larga de una cadena pasada como parametro.
 * Las palabras de la cadena introducida deben estar separadas por al menos un espacio.
 * Se deben obviar caracteres que no sean letras y caracteres extranos (palabras acentuadas, con dieresis...).
 * Si hay dos palabras con la maxima longitud, devuelve la primera que aparece en la cadena.
 *
 * @author D4s1ns
 * @version 2018/02/08
 */
public class PalabraMasLarga {
    /**
     * Devuelve la palabra mas larga de una cadena.
     * Las palabras deben estar separadas por, al menos, un espacio.
     * Ignora cualquier caracterer que no sea una letra, incluidos numeros, letras acentuadas, etc.
     * Si existen dos palabras con la misma longitud, devuelve la primera.
     * 
     * @param cadena La cadena donde se busca la palabra mas larga. (Las palabras deben estar separadas, al menos, por un espacio).
     * @return Devuelve la primera palabra mas larga de la cadena indicada por parametro. Devuelve null, si la cadena esta vacia.
     */
    public String palabraMasLarga(String cadena) {
        String palabraMasLarga = null;
        int masCorta = 0; // La longitud de la palabra mas corta.
        String[] palabras = cadena.replaceAll("[^a-zA-Z ]", "").split(" "); // Elimina lo que no sean letras 
                                                                            // y divide la cadena por espacios.
        for(int i = 0; i < palabras.length; i++){
            if(palabras[i].length() > masCorta) {
                masCorta = palabras[i].length();
                palabraMasLarga = palabras[i];
            }
        }
        return palabraMasLarga;
    }
}
