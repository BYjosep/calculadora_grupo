package com.byjosep04.tema04;

import java.util.Scanner;

public class Operaciones_aritmeticas {
    public static Scanner escaner = new Scanner(System.in);
    /**
     *@author josehs
     */


    /**
     * @return sumar: Hacemos una suma de dos floats;
     */
    public static String sumarNumero(){
        System.out.println("Sumar\nDime el primer número: ");
        float x=Float.parseFloat(escaner.nextLine());
        System.out.println("Dime el segundo número: ");
        float y=Float.parseFloat(escaner.nextLine());
        float sumar=x+y;
        return "La suma de " +x+ " y " + y+ " es: "+sumar;
    }

    /**
     * @return restar: Restamos de dos numeros;
     */
    public static String restarNumero(){
        System.out.println("Restar\nDime el minuendo: ");
        float x=Float.parseFloat(escaner.nextLine());
        System.out.println("Dime el sustraendo: ");
        float y=Float.parseFloat(escaner.nextLine());
        float restar=x-y;
        return "La resta de " +x+ " y " + y+ " es: "+restar;

    }

    /**
     * @return multiplicar: Multiplicar dos numeros;
     */
    public static String multiplicarNumero(){
        System.out.println("Multiplicar\nDime el primer número: ");
        float x=Float.parseFloat(escaner.nextLine());
        System.out.println("Dime el segundo número: ");
        float y=Float.parseFloat(escaner.nextLine());
        float multiplicar=x*y;
        return "La multiplicacion de " +x+ " y " + y+ " es: "+multiplicar;

    }

    /**
     * @return dividir: dividimos dos numeros;
     */
    public static String dividirNumero(){
        System.out.println("Dividir\nDime el dividendo: ");
        float x=Float.parseFloat(escaner.nextLine());
        System.out.println("Dime el divisor: ");
        float y=Float.parseFloat(escaner.nextLine());
        float dividir=x/y;
        return "La division de " +x+ " y " + y + " es: "+dividir;
    }

    /**
     * @return resto: sacamos el resto de una division;
     */
    public static String restoDivision(){
        System.out.println("Resto de la division\nDime el divisor: ");
        float x=Float.parseFloat(escaner.nextLine());
        System.out.println("Dime el divisor: ");
        float y=Float.parseFloat(escaner.nextLine());
        float resto=x%y;
        return "El resto de la division de " +x+ " y " + y+ " es: "+resto;
    }
}
