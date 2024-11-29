package com.byjosep04.tema04;

import java.util.Scanner;

/**
 *@author josehs
 */
public class Operaciones_aritmeticas {
    public static Scanner escaner = new Scanner(System.in);

    /**
     * @return String sumar: Hacemos que se imprima la suma como un float;
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
     * @return String restar: Hacemos que se imprima la resta como un float;
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
     * @return String multiplicar: Hacemos que se imprima el producto como un float;
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
     * @return String dividir: Hacemos que se imprima el cociente como un float;
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
     * @return String resto: Hacemos que se imprima el resto de la division como un float;
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
