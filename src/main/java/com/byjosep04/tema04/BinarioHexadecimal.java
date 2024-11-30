package com.byjosep04.tema04;

import com.byjosep04.tema04.lib.StringLib;


/**
 * @author BYjosep04
 */
public class BinarioHexadecimal {
    public static final String ESC = "\u001b[";


    /**
     * Usando el metodo {@link DecimalHexadecimal#hexadecimalADecimal HexadecimalADecimal} y
     * {@link BinarioDecimal#decimalBinario decimalBinario} se pasa de hexadecimal a binario.
     */

    public static void hexadecimalBinario() {
        String numero= StringLib.ingresarTexto("Ingrese un numero en hexadecimal");
        int decimal;
        String binario ;
        decimal=DecimalHexadecimal.hexadecimalADecimal(numero);
        binario= BinarioDecimal.decimalBinario(decimal);

        System.out.println("El numero en binario es: "+binario);
    }


    /**
     * Usando el metodo {@link BinarioDecimal#binarioDecimal binarioDecimal} y
     * {@link DecimalHexadecimal#decimalAHexadecimal decimalAHexadecimal} se pasa de binario a hexadecimal.
     */
    public static void binarioHexadecimal() {
        int decimal;
        StringBuilder str= new StringBuilder();
        String hexadecimal;

        String numero= StringLib.ingresarTexto("Ingrese un numero en binario");
        str.append(BinarioDecimal.binarioDecimal(numero));
       decimal=DecimalHexadecimal.hexadecimalADecimal(numero);
       str.replace(0,22,"");
       decimal= Integer.parseInt(str.toString());
       str.replace(0, str.length(),"");
       hexadecimal=DecimalHexadecimal.decimalAHexadecimal(decimal);

      System.out.println("El numero en hexadecimal es: "+ hexadecimal);
    }

}


