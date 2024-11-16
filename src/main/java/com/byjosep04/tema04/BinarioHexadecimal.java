package com.byjosep04.tema04;

import java.util.Scanner;
public class BinarioHexadecimal {
    public static Scanner scanner = new Scanner(System.in);
    public static final String ESC = "\u001b[";

    public static void main(String[] args) {
    int opcion;
    String numero;
    String conversion;
    do {
        System.out.print(ESC + "H");
        System.out.print(ESC + "2J");
        System.out.flush();
        opcion = ingresarUnNumero("Ingrese una opcion\n" +
                "1. Hexadecimal a binario\n" +
                "2. Binario a hexadecimal\n" +
                "0. Salir",0,2);
        switch (opcion) {
            case 1-> {
                numero= ingresarTexto("Ingrese un numero en hexadecimal");
                conversion = hexadecimalBinario(numero);
                System.out.println(conversion);
            }
            case 2-> {
                numero= ingresarTexto("Ingrese un numero en binario");
                System.out.println(numero);
            }
            default -> {}
        }
    }while (opcion != 0);

    }


    /**
     * Ingresar número con valor minimo y maximo.
     * Recuerde cerrar {@link Scanner Scanner} con el metodo cerrarScanner
     * (Echo para no tener que estar escribiendo este codigo en cada ejercicio)
     *
     * @return Devuelve la frase ingresada en formato {@link Character char}
     */
    public static int ingresarUnNumero(String texto, int min, int max) {
        int numero;

        do {

            System.out.println(texto);
            numero = Integer.parseInt(scanner.nextLine());
        }while (numero < min && numero > max);

        return numero;

    }


    /**
     * Ingresar text.
     * Recuerde cerrar {@link Scanner Scanner} con el metodo cerrarScaner
     * (Echo para no tener que estar escribiendo este codigo en cada ejercicio)
     * @return Devuelve la frase ingresada en formato {@link String String}
     */
    public static String ingresarTexto(String texto) {
        String palabra;

        System.out.println(texto);
        palabra = scanner.nextLine();

        return palabra;

    }


    /**
     * @author BYjosep04
     * @param numero Ingresa un numero en hexadecimal a binario en formato {@link String String}
     * @return Devuelve un {@link String String} con el número en binario
     */
    public static String hexadecimalBinario(String numero) {
        final String HEXA_STR="0123456789ABCDEF";
        numero = numero.trim();
        StringBuilder textoReverso = new StringBuilder(numero);
        numero = textoReverso.reverse().toString();
        numero = numero.toUpperCase();

        int valor =0;
        char aux;

        for (int i = 0; i < numero.length(); i++) {
            aux = numero.charAt(i);



            valor = valor+ HEXA_STR.indexOf(aux);
        }


        return "El valor decimal es: "+valor;
    }


    public static String binarioHexadecimal(String numero) {
        int binario, decimal;
        String hexadecimal ;
        binario = Integer.parseInt(numero);

        decimal = binario % 2;
        return "El resultado es "+decimal;
    }
}


