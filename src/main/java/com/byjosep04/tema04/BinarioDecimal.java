package com.byjosep04.tema04;

/**
 * Clase para convertir números entre binario y decimal.
 *
 * @author Alvaro Campos Bolufer
 */
public class BinarioDecimal {


    /**
     * Convierte un número binario a decimal de forma manual.
     *
     * @param numero Número en binario.
     * @return Número en decimal como {@link String String}.
     * @author Alvaro Campos Bolufer
     */
    public static String binarioDecimal(String numero) {
        //Se podrían realizar operaciones de conversión de decimal a binario con coma usando double 
        //pero el proceso es mas complejo y no creo que sea de útilidad, para un usario final ya que no conigue una información que considere relevante
        try {
            int decimal = 0;
            int numpotencia = 0;

            // Convertir de binario a decimal recorriendo el número desde el final, no se si es la mejor forma de hacerlo
            for (int i = numero.length() - 1; i >= 0; i--) {
                char bit = numero.charAt(i);
                if (bit == '1') {
                    decimal += potencia(2, numpotencia); //Sirve para a través de potencias conseguir que un binario se convierta en un decimal
                } else if (bit != '0') {
                    return "Error: El número ingresado no es un binario válido."; //Mensaje por si el número no es valido
                }
                numpotencia++;
            }
            return "El número decimal es: " + decimal;
        } catch (Exception e) {
            return "Error: Ocurrió un problema al procesar el número."; //Lanza una excepción en caso de que no se pudiera procesar el número
        }
    }

    /**
     * Convierte un número decimal a binario de forma manual.
     *
     * @param numero Número en decimal.
     * @return Número en binario como {@link String String}.
     * @author Alvaro Campos Bolufer
     */
    public static String decimalBinario(int numero) {
        StringBuilder binario = new StringBuilder();

        // Convertir de decimal a binario dividiendo sucesivamente entre 2, bastante sencillo pero funciona muy bien
        while (numero > 0) {
            binario.insert(0, numero % 2);         // Obtiene el residuo (0 o 1) y lo coloca al inicio
            numero /= 2;                           // Divide el número por 2
        }

        return "El número binario es: " + (binario.length() > 0 ? binario.toString() : "0");
    }

    /**
     * Se usa en el metodo binarioDecimal, ya que no se puede usar Math.pow().
     *
     * @param base      Base sobre la que se aplica el exponente
     * @param exponente El propio exponente, las veces que se multiplicara por sí misma la base.
     * @author Alvaro Campos Bolufer
     */
    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {     //Sirve para a través de potencias conseguir que un binario se convierta en un decimal, el for lo que hace es multiplicar por la base hasta llegar al exponente
            resultado *= base;
        }
        return resultado;
    }
}
