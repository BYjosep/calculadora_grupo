package com.byjosep04.tema04;

import java.util.Scanner;

public class Operaciones_aritmeticas {
  /*
  1.Sumar
  (x+y)
  2.Restar
  (x-y)
  3.Multiplicar
  (x*y)
  4.Dividir
  (x/y)
  5.Resto de la division
  (x%y)
  */
    /**
     *@author josehs
     *El que borre o cambie este codigo es gay
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
                System.out.println("Sumar");
                System.out.println("Dime el primer numero: ");
                float x=Float.parseFloat(escaner.nextLine());
                System.out.println("Dime el segundo numero: ");
                float y=Float.parseFloat(escaner.nextLine());
                float z=x+y;
                System.out.println("La suma de " +x+ " y " + y+ " es: "+z);
            }else if(n==2){
                System.out.println("Restar");
                System.out.println("Dime el primer numero: ");
                float x=Float.parseFloat(escaner.nextLine());
                System.out.println("Dime el segundo numero: ");
                float y=Float.parseFloat(escaner.nextLine());
                float z=x-y;
                System.out.println("La resta de " +x+ " y " + y+ " es: "+z);
            }else if(n==3){
                System.out.println("Multiplicar");
                System.out.println("Dime el primer numero: ");
                float x=Float.parseFloat(escaner.nextLine());
                System.out.println("Dime el segundo numero: ");
                float y=Float.parseFloat(escaner.nextLine());
                float z=x*y;
                System.out.println("La multiplicacion de " +x+ " y " + y+ " es: "+z);
            }else if(n==4){
                System.out.println("Dividir");
                System.out.println("Dime el primer numero: ");
                float x=Float.parseFloat(escaner.nextLine());
                System.out.println("Dime el segundo numero: ");
                float y=Float.parseFloat(escaner.nextLine());
                float z=x/y;
                System.out.println("La division de " +x+ " y " + y + " es: "+z);
            }else if(n==5){
                System.out.println("Resto de la division");
                System.out.println("Dime el primer numero: ");
                float x=Float.parseFloat(escaner.nextLine());
                System.out.println("Dime el segundo numero: ");
                float y=Float.parseFloat(escaner.nextLine());
                float z=x%y;
                System.out.println("El resto de la division de " +x+ " y " + y+ " es: "+z);
            }
        } while(n != 0);
    }
}
