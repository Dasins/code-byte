
/**
 * Clase que modela objetos capaces de calcular el factorial de un numero entero.
 * El factorial de un numero es la multiplicación de todos los numeros
 * naturales entre 1 y ese numero.
 * El factorial de 0, es 1.
 *
 * @author D4s1ns
 * @version 2018/02/08
 */
public class Factorial{
    /**
     * Devuelve el factorial del numero entero indicado por parametro.
     * Si el numero indicado es 0, devuelve 1.
     * 
     * @param El numero del que se quiere obtener el factorial.
     * @return Devuelve el factorial del numero indicado por parametro.
     */
    public int factorial(int num){
        int factorial = 1;
        for(int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
