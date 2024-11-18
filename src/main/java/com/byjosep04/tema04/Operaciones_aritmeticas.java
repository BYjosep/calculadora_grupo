package com.byjosep04.tema04;

import java.util.Scanner;

public class Operaciones_aritmeticas {
    /**
     *@author josehs
     */
    public static void main( String args[] ) {
        Scanner escaner = new Scanner(System.in);
        int n;

        do{
            System.out.println("Operaciones aritmeticas");
            System.out.println("==============");
            System.out.println("1. Sumar.");
            System.out.println("2. Restar.");
            System.out.println("3. Multiplicar.");
            System.out.println("4. Dividir.");
            System.out.println("5. Resto de la division");
            System.out.println("------------------------------------");
            System.out.println("0. Salir");
            n = Integer.parseInt(escaner.nextLine());
            if(n==1){
                sumarNumero();
            }else if(n==2){
                restarNumero();
            }else if(n==3){
                multiplicarNumero();
            }else if(n==4){
                dividirNumero();
            }else if(n==5){
                restoDivision();
            }
        } while(n != 0);
    }
    public static float sumarNumero(){
        Scanner escaner = new Scanner(System.in);
        System.out.println("Sumar");
        System.out.println("Dime el primer numero: ");
        float x=Float.parseFloat(escaner.nextLine());
        System.out.println("Dime el segundo numero: ");
        float y=Float.parseFloat(escaner.nextLine());
        float sumar=x+y;
        System.out.println("La suma de " +x+ " y " + y+ " es: "+sumar);
        return sumar;
    }
    public static float restarNumero(){
        Scanner escaner = new Scanner(System.in);
        System.out.println("Restar");
        System.out.println("Dime el primer numero: ");
        float x=Float.parseFloat(escaner.nextLine());
        System.out.println("Dime el segundo numero: ");
        float y=Float.parseFloat(escaner.nextLine());
        float restar=x-y;
        System.out.println("La resta de " +x+ " y " + y+ " es: "+restar);
        return restar;
    }
    public static float multiplicarNumero(){
        Scanner escaner = new Scanner(System.in);
        System.out.println("Multiplicar");
        System.out.println("Dime el primer numero: ");
        float x=Float.parseFloat(escaner.nextLine());
        System.out.println("Dime el segundo numero: ");
        float y=Float.parseFloat(escaner.nextLine());
        float multiplicar=x*y;
        System.out.println("La multiplicacion de " +x+ " y " + y+ " es: "+multiplicar);
        return multiplicar;
    }
    public static float dividirNumero(){
        Scanner escaner = new Scanner(System.in);
        System.out.println("Dividir");
        System.out.println("Dime el primer numero: ");
        float x=Float.parseFloat(escaner.nextLine());
        System.out.println("Dime el segundo numero: ");
        float y=Float.parseFloat(escaner.nextLine());
        float dividir=x/y;
        System.out.println("La division de " +x+ " y " + y + " es: "+dividir);
        return dividir;
    }
    public static float restoDivision(){
        Scanner escaner = new Scanner(System.in);
        System.out.println("Resto de la division");
        System.out.println("Dime el primer numero: ");
        float x=Float.parseFloat(escaner.nextLine());
        System.out.println("Dime el segundo numero: ");
        float y=Float.parseFloat(escaner.nextLine());
        float resto=x%y;
        System.out.println("El resto de la division de " +x+ " y " + y+ " es: "+resto);
        return resto;
    }
}
