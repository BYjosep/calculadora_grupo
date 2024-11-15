package com.byjosep04.tema04;

import java.util.Scanner;

public class DecimalHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero en sistema decimal");
        int numero = scanner.nextInt();

        String hexadecimal = decimalAHexadecimal(numero);
        System.out.println("El número " + numero + " en hexadecimal es: " + hexadecimal);
    }

    /**
     * Convertir un numero decimal en hexadecimal
     * @param numero el numero decimal
     * @return su equivalente en hexadeimal
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
}
