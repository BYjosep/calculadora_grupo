package com.byjosep04.tema04;

import com.byjosep04.tema04.lib.StringLib;
public class Main {
    public static final String ESC = "\u001b[";
    public static void main(String[] args) {
        int opcion;

        do {
            System.out.print(ESC + "H");
            System.out.print(ESC + "2J");
            System.out.flush();
            opcion=StringLib.ingresarUnNumero("""
                | Menu Principal              |
                |-----------------------------|
                | 1- Operaciones aritmeticas. |
                | 2- Conversion de bases.     |
                |-----------------------------|
                | 0- salir                    |
                """, 0,2);
            switch(opcion){
                case 1-> menuOperacion();
                case 2-> menuConversion();
                case 0-> {}
            }
        }while (opcion!=0);

    }

    /**
     * Este es el submenu para las operaciones.
     * Las operaciones son sumar, restar, multiplicar, dividir y sacar el resto
     */
    private static void menuOperacion(){
        int opcion;
        String total= "";

        System.out.print(ESC + "H");
        System.out.print(ESC + "2J");
        System.out.flush();
        do {

            opcion = StringLib.ingresarUnNumero("""
                | Operaciones aritmeticas |
                |-------------------------|
                | 1. Sumar.               |
                | 2. Restar.              |
                | 3. Multiplicar.         |
                | 4. Dividir.             |
                | 5. Resto de la division |
                |-------------------------|
                | 0. Salir                |
                """,0,5);

            switch(opcion){
                case 1-> total=Operaciones_aritmeticas.sumarNumero();
                case 2-> total=Operaciones_aritmeticas.restarNumero();
                case 3-> total=Operaciones_aritmeticas.multiplicarNumero();
                case 4 -> total=Operaciones_aritmeticas.dividirNumero();
                case 5 -> total=Operaciones_aritmeticas.restoDivision();
                case 0 -> {}
            }
            if (opcion!= 0){
                System.out.println(total);
            }
        }while (opcion!=0);

    }

    /**
     * Este es el submenu para la conversion de bases
     * las bases son: binario decimal y hexadecimal
     */
    private static void menuConversion(){
        int numero, opcion;
        String total= "";

        System.out.print(ESC + "H");
        System.out.print(ESC + "2J");
        System.out.flush();


        do {

           opcion = StringLib.ingresarUnNumero("""
                | Conversion de bases      |
                |--------------------------|
                | 1. Decimal a binario.    |
                | 2. Binario a decimal.    |
                | 3. Decimal a hexadecimal |
                | 4. Hexadecimal a decimal |
                | 5. Binario a hexadecimal |
                | 6. Hexadecimal a binario |
                |--------------------------|
                | 0. Salir                 |
                """,0,6);

           switch(opcion){
                case 1-> {
                    numero = StringLib.ingresarUnNumero("Ingrese un número en decimal:");
                    String conversion = BinarioDecimal.decimalBinario(numero);
                    System.out.println(conversion);
                }
                case 2-> {
                     String num = StringLib.ingresarTexto("Ingrese un número en binario:");
                    String conversion = BinarioDecimal.binarioDecimal(num);
                    System.out.println(conversion);
                }
                case 3-> {
                    numero = StringLib.ingresarUnNumero("Ingresa un numero en decimal");
                    String hexadecimal = DecimalHexadecimal.decimalAHexadecimal(numero);
                    System.out.println("El número " + numero + " en hexadecimal es: " + hexadecimal);
                }
                case 4-> {
                    String hexadecimal = StringLib.ingresarTexto("Ingresa un numero en hexadecimal");
                    numero=DecimalHexadecimal.hexadecimalADecimal(hexadecimal);
                    System.out.println("El número " + hexadecimal + " en decimal es: " + numero);
                }
                case 5-> BinarioHexadecimal.binarioHexadecimal();
                case 6-> BinarioHexadecimal.hexadecimalBinario();
                case 0-> {}
            }
            if (opcion!= 0){
                System.out.println(total);
            }
        }while (opcion!=0);

    }
}