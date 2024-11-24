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
     * @author BYjosep04
     * @param numero Ingresa un numero en hexadecimal a binario en formato {@link String String}
     * @return Devuelve un {@link String String} con el número en binario
     */

    public static String hexadecimalBinario(String numero) {
        int decimal =0;
        String binario = "";
        decimal=DecimalHexadecimal.HexadecimalADecimal(numero);

        return binario;
    }


    public static String binarioHexadecimal(String numero) {
        int numeroDecimal=0;


        return DecimalHexadecimal.decimalAHexadecimal(numeroDecimal);
    }

}


