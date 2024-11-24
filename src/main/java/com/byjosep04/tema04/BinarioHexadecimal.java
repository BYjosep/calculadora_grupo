package com.byjosep04.tema04;

import com.byjosep04.tema04.lib.StringLib;


/**
 * @author BYjosep04
 */
public class BinarioHexadecimal {
    public static final String ESC = "\u001b[";

    public static void main(String[] args) {
    int opcion;
    String numero;
    String conversion;
    do {
        System.out.print(ESC + "H");
        System.out.print(ESC + "2J");
        System.out.flush();
        opcion = StringLib.ingresarUnNumero("""
                Ingrese una opcion
                1. Hexadecimal a binario
                2. Binario a hexadecimal
                0. Salir""",0,2);
        switch (opcion) {
            case 1-> {
                numero= StringLib.ingresarTexto("Ingrese un numero en hexadecimal");
                conversion = hexadecimalBinario(numero);
                System.out.println(conversion);
            }
            case 2-> {
                numero= StringLib.ingresarTexto("Ingrese un numero en binario");
                conversion = binarioHexadecimal(numero);
                System.out.println(conversion);
            }
            default -> {}
        }
    }while (opcion != 0);

    }


    /**
     * Usando el metodo {@link DecimalHexadecimal#HexadecimalADecimal HexadecimalADecimal} y
     * {@link BinarioDecimal#decimalBinario decimalBinario} se pasa de hexadecimal a binario.
     * @param numero Ingresa un numero en hexadecimal a binario en formato {@link String String}
     * @return Devuelve un {@link String String} con el número en binario
     */

    public static String hexadecimalBinario(String numero) {
        int decimal;
        String binario ;
        decimal=DecimalHexadecimal.HexadecimalADecimal(numero);
        binario= BinarioDecimal.decimalBinario(decimal);
        return binario;
    }


    /**
     * Usando el metodo {@link BinarioDecimal#binarioDecimal binarioDecimal} y
     * {@link DecimalHexadecimal#decimalAHexadecimal decimalAHexadecimal} se pasa de binario a hexadecimal.
     * @param numero {@link String String} con el número en binario
     * @return Devuelve el número hexadecimal en formato {@link String String}
     */
    public static String binarioHexadecimal(String numero) {
       int decimal;
       StringBuilder str= new StringBuilder();
       String hexadecimal;
       str.append(BinarioDecimal.binarioDecimal(numero));
       str.replace(0,22,"");
       decimal= Integer.parseInt(str.toString());
       str.replace(0, str.length(),"");
       hexadecimal=DecimalHexadecimal.decimalAHexadecimal(decimal);
       str.append("El numero en hexadecimal es: ").append(hexadecimal);
        return str.toString();
    }

}


