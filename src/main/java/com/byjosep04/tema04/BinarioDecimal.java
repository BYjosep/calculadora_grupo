package com.byjosep04.tema04;

import com.byjosep04.tema04.lib.StringLib;

/**
 * @author Alvaro Campos Bolufer
 */
public class BinarioDecimal {
    public static final String ESC = "\u001b[";

    public static void main(String[] args) {
        int opcion;
        String numero;
        String conversion;

        do {
            System.out.print(ESC + "H");
            System.out.print(ESC + "2J");
            System.out.flush();

            opcion = StringLib.ingresarUnNumero("Ingrese una opción:\n" +
                    "1. Binario a decimal\n" +
                    "2. Decimal a binario\n" +
                    "0. Salir", 0, 2);

            switch (opcion) {
                case 1 -> {
                    numero = StringLib.ingresarTexto("Ingrese un número en binario:");
                    conversion = binarioDecimal(numero);
                    System.out.println(conversion);
                }
                case 2 -> {
                    numero = StringLib.ingresarTexto("Ingrese un número en decimal:");
                    conversion = decimalBinario(Integer.parseInt(numero));
                    System.out.println(conversion);
                }
                default -> {
                }
            }
        } while (opcion != 0);
    }
    /**
     * Convierte un número binario a decimal de forma manual.
     * @author Alvaro Campos Bolufer
     * @param numero Número en binario.
     * @return Número en decimal como {@link String String}.
     */
    public static String binarioDecimal(String numero) {
        try {
            int decimal = 0;
            int numpotencia = 0;

            // Convertir de binario a decimal recorriendo el número desde el final, no se si es la mejor forma de hacerlo
            for (int i = numero.length() - 1; i >= 0; i--) {
                char bit = numero.charAt(i);
                if (bit == '1') {
                    decimal += potencia(2, numpotencia); //Este a mi me ralla, luego lo tengo que revisar porque no entiendo bien como funciona por mucho que lo lea
                } else if (bit != '0') {
                    return "Error: El número ingresado no es un binario válido.";
                }
                numpotencia++;
            }
            return "El número decimal es: " + decimal;
        } catch (Exception e) {
            return "Error: Ocurrió un problema al procesar el número.";
        }
    }

    /**
     * Convierte un número decimal a binario de forma manual.
     * @author Alvaro Campos Bolufer
     * @param numero Número en decimal.
     * @return Número en binario como {@link String String}.
     */
    public static String decimalBinario(int numero) {
        StringBuilder binario = new StringBuilder();

        // Convertir de decimal a binario dividiendo sucesivamente entre 2
        while (numero > 0) {
            binario.insert(0, numero % 2); // Obtiene el residuo (0 o 1) y lo coloca al inicio
            numero /= 2; // Divide el número por 2
        }

        return "El número binario es: " + (binario.length() > 0 ? binario.toString() : "0");
    }

    /**
     * Se usa en el metodo binarioDecimal ya que no se puede usar Math.pow().
     * @author Alvaro Campos Bolufer
     * @param base Base sobre la que se aplica el exponente
     * @param exponente El propio exponente, las veces que se multiplicara por si misma la base.
     * @return
     */
    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
