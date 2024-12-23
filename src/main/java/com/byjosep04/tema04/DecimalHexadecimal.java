package com.byjosep04.tema04;

public class DecimalHexadecimal {


    /**
     * Convertir un numero decimal en hexadecimal
     *
     * @param numero el número decimal
     * @return su equivalente en hexadecimal
     */
    public static String decimalAHexadecimal(int numero) {
        StringBuilder resultado = new StringBuilder();


        if (numero == 0) return "0";
        if (numero < 0) {
            return "-" + decimalAHexadecimal(-numero);
        }


        char[] hexChar = {'0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};


        while (numero > 0) {
            int residuo = numero % 16;
            resultado.append(hexChar[residuo]);
            numero /= 16;
        }


        return resultado.reverse().toString();

    }

    /**
     * convertir hexadecimal a decimal
     *
     * @param hex numero hexadecimal
     * @return Devuelve el número en formato decimal con formato entero
     */
    public static int hexadecimalADecimal(String hex) {
        int decimal = 0;
        int base = 16; // Base del sistema hexadecimal

        // Convertir a mayúsculas para tratar uniformemente las letras
        hex = hex.toUpperCase();

        // Procesar cada carácter del número hexadecimal
        for (int i = 0; i < hex.length(); i++) {
            char caracter = hex.charAt(i);

            // Obtener el valor numérico del carácter
            int valor = 0;
            if (caracter >= '0' && caracter <= '9') {
                valor = caracter - '0'; // Convertir dígito ('0'-'9') a número
            } else if (caracter >= 'A' && caracter <= 'F') {
                valor = caracter - 'A' + 10; // Convertir letra ('A'-'F') a número (10-15)
            } else {
                System.err.println("Cadena no válida: contiene caracteres no hexadecimales");
            }

            // Calcular el valor decimal sumando valor * 16^(posición desde el final)
            decimal = decimal * base + valor;
        }

        return decimal;
    }
}
