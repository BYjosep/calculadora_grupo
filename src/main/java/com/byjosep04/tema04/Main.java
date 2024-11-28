package com.byjosep04.tema04;

import com.byjosep04.tema04.lib.StringLib;
public class Main {
    public static void main(String[] args) {
        int opcion;
        opcion=StringLib.ingresarUnNumero("""
                | Menu Principal              |
                |-----------------------------|
                | 1- Operaciones aritmeticas. |
                | 2- Conversion de bases.     |
                |-----------------------------|
                | 0- salir                    |
                """, 0,2);
        switch(opcion){
            case 1-> {
                menuOperacion();
            }
            case 2-> {
                menuConversion();
            }
            case 0-> {}
        }
    }

    private static void menuOperacion(){
        int opcion;
        String total= "";
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
    private static void menuConversion(){

        int opcion;
        String total= "";

       do {

            opcion = StringLib.ingresarUnNumero("""
                | Convercion de bases      |
                |--------------------------| 
                | 1. Decimal a binario.    |
                | 2. Binario a decimal.    |
                | 3. Hexadecimal a binario |
                | 4. Binario a hexadecimal |
                | 5. Binario a hexadecimal |
                | 6. Hexadecimal a binario |
                |--------------------------|
                | 0. Salir                 |
                """,0,6);

            switch(opcion){
                case 1-> ;
                case 2-> ;
                case 3-> ;
                case 4-> ;
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