package com.byjosep04.tema04.lib;

import java.util.Scanner;

/**
 * @author BYjosep04
 */
public class StringLib {

    public static Scanner scanner = new Scanner(System.in);
    /* ******************************
     *  ********** Entrada ************
     *  ****************************** */

    /**
     * cerrar {@link Scanner Scanner}
     */
    public static void cerrarScaner() {
        scanner.close();
    }

    /**
     * Ingresar frase
     * Recuerde cerrar {@link Scanner Scanner} con el metodo cerrarScaner
     * (Echo para no tener que estar escribiendo este codigo en cada ejercicio)
     *
     * @return Devuelve la frase ingresada en formato {@link String String}
     */
    public static String ingresarFrase() {
        String frase;
        System.out.println("Ingrese una frase");
        frase = scanner.nextLine();
        return frase;

    }

    /**
     * Ingresar text.
     * Recuerde cerrar {@link Scanner Scanner} con el metodo cerrarScaner
     * (Echo para no tener que estar escribiendo este codigo en cada ejercicio)
     *
     * @return Devuelve la frase ingresada en formato {@link String String}
     */
    public static String ingresarTexto(String texto) {
        String palabra;

        System.out.println(texto);
        palabra = scanner.nextLine();

        return palabra;

    }

    /**
     * Ingresar text.
     * Recuerde cerrar {@link Scanner Scanner} con el metodo cerrarScaner
     * (Echo para no tener que estar escribiendo este codigo en cada ejercicio)
     *
     * @return Devuelve la frase ingresada en formato {@link String String}
     */
    public static int ingresarOpcin(String texto) {
        int opciom;

        System.out.println(texto);
        opciom = Integer.parseInt(scanner.nextLine());

        return opciom;

    }

    /**
     * Ingresar text.
     * Recuerde cerrar {@link Scanner Scanner} con el metodo cerrarScaner
     * (Echo para no tener que estar escribiendo este codigo en cada ejercicio)
     *
     * @return Devuelve la frase ingresada en formato {@link Character char}
     */
    public static char ingresarUnCaracter(String texto) {
        String palabra;

        do {
            System.out.println(texto);

            palabra = scanner.nextLine();
        } while (palabra.length() != 1);

        return palabra.charAt(0);

    }


    /**
     * Ingresar text.
     * Recuerde cerrar {@link Scanner Scanner} con el metodo cerrarScaner
     * (Echo para no tener que estar escribiendo este codigo en cada ejercicio)
     *
     * @return Devuelve la frase ingresada en formato {@link Character char}
     */
    public static int ingresarUnNumero(String texto) {
        System.out.println(texto);

        return Integer.parseInt(scanner.nextLine());

    }

    /**
     * Ingresar un número con un valor minimo.
     * Recuerde cerrar {@link Scanner Scanner} con el metodo cerrarScaner
     * (Echo para no tener que estar escribiendo este codigo en cada ejercicio)
     *
     * @return Devuelve la frase ingresada en formato {@link Character char}
     */
    public static int ingresarUnNumero(String texto, int min) {
        int numero;
        do {
            System.out.println(texto);
            numero = Integer.parseInt(scanner.nextLine());

        } while (numero < min);


        return numero;

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
        } while (numero < min && numero > max);

        return numero;

    }




    /* ******************************
     *  ********** Salida ************
     *  ****************************** */

    /**
     * Transforma el primer caracter en mayúsculas
     *
     * @param frase Introducir un String con la frase
     * @return Devuelve un String con la primera letra en mayúscula
     */
    public static String primeraLetraMayuscula(String frase) {
        String mensajeModificado;
        String letra, resto;
        letra = String.valueOf(frase.charAt(0));
        letra = letra.toUpperCase();
        resto = frase.substring(1);

        mensajeModificado = letra + resto;

        return mensajeModificado;
    }


    /**
     * @param frase El parametro es un String
     * @return devuelve una frase con el numero de vocales y consonantes
     */
    public static String cantidadVocalesYConsonantes(String frase) {
        // variables
        int longitud;
        String resultado;
        int vocales, consonantes;
        vocales = 0;
        consonantes = 0;
        /*
         * Para evitar tener que poner más letras en el swich
         * se han pasado todos los caracteres a minusculas
         */
        frase = frase.toLowerCase();
        longitud = frase.length();

        for (int i = 0; i < longitud; i++) {

            switch (frase.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' -> vocales += 1;
                case 'q', 'w', 'r', 't',
                     'y', 'p', 's', 'd',
                     'f', 'g', 'h', 'j',
                     'k', 'l', 'z', 'x',
                     'c', 'v', 'b', 'n', 'm', 'ñ', 'ç' -> consonantes += 1;
            }
        }
        resultado = vocales + " vocales y " + consonantes + " consonates";
        return resultado;

    }


    /**
     * @param mensaje Variable como {@link StringBuilder StringBuilder}
     * @return Devuelve un entero como valor
     */
    public static int contadorPalabras(StringBuilder mensaje) {
        String mensajeStr = mensaje.toString();
        mensajeStr = mensajeStr.trim();

        return mensajeStr.split("\\s|\n").length;
    }


    /**
     * @param mensaje Variable como {@link String String}
     * @return Devuelve un entero como valor
     */
    public static int contadorPalabras(String mensaje) {
        mensaje = mensaje.trim();

        return mensaje.split("\\s|\n").length;
    }


    /**
     * Ingrese un mensaje y devuelve la cantidad de vocales y consonantes
     * de cada palabra
     *
     * @param mensaje Inserte el mensaje en formato {@link StringBuilder String}
     * @return devuelve el valor en formato {@link StringBuilder StringBuilder}
     */
    public static StringBuilder contadorVocalesConsonantesPorPalabras(StringBuilder mensaje) {
        StringBuilder mensajeEntregado = new StringBuilder();
        String mensajeStr = mensaje.toString();
        String[] array = mensajeStr.split("\\s|\n|,");

        for (int i = 0; i < mensajeStr.split("\\s|\n|,").length; i++) {
            mensajeEntregado.append("La palabra ").append(i + 1).append(" tiene ").append(StringLib.cantidadVocalesYConsonantes(array[i])).append(".\n");

        }

        return mensajeEntregado;
    }


    /**
     * Ingrese un mensaje y devuelve la cantidad de vocales y consonantes
     * de cada palabra
     *
     * @param mensaje Inserte el mensaje en formato {@link String String}
     * @return devuelve el valor en formato {@link StringBuilder StringBuilder}
     */
    public static StringBuilder contadorVocalesConsonantesPorPalabras(String mensaje) {
        StringBuilder mensajeEntregado = new StringBuilder();
        String[] array;
        array = mensaje.split("\\s|\n|,");


        for (int i = 0; i < mensaje.split("\\s|\n|,").length; i++) {
            mensajeEntregado.append("La palabra ").append(i + 1).append(" tiene ").append(StringLib.cantidadVocalesYConsonantes(array[i])).append(".\n");

        }


        return mensajeEntregado;
    }


    /**
     * @param mensaje Ingrese el mensaje que desee en formato {@link StringBuilder StringBuilder}
     * @return devuelve un string con un mensaje que indica la palabra más grande y cuantas letras tiene
     */
    public static String palabraMasGRande(StringBuilder mensaje) {
        String mensajeEntregado;
        String mensajeStr = mensaje.toString();
        String[] array = mensajeStr.split("\\s|\n|,");
        String palabra = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > palabra.length()) {
                palabra = array[i];
            }

        }
        mensajeEntregado = "La palabra " + palabra + " tiene " + palabra.length() + " letras.";

        return mensajeEntregado;
    }


    /**
     * @param mensaje Ingrese el mensaje que desee en formato {@link String String}
     * @return devuelve un string con un mensaje que indica la palabra más grande y cuantas letras tiene
     */
    public static String palabraMasGRande(String mensaje) {
        String mensajeEntregado;
        String[] array = mensaje.split("\\s|\n|,");
        String palabra = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > palabra.length()) {
                palabra = array[i];
            }

        }
        mensajeEntregado = "La palabra " + palabra + " tiene " + palabra.length() + " letras.";

        return mensajeEntregado;
    }

    /**
     * @param frase Ingresa una frase en formato {@link String String}
     * @param veces Ingresa el número de veces en formato {@link Integer int}
     * @return Devuelve un texto en formato {@link StringBuilder StringBuilder}
     */
    public static StringBuilder repetirFrase(String frase, int veces) {
        StringBuilder mensaje = new StringBuilder();

        for (int i = 0; i < veces; i++) {
            mensaje.append(frase).append("\n");
        }
        return mensaje;
    }

    /**
     * @param frase Ingresa una frase en formato {@link String String}
     * @param veces Ingresa el número de veces en formato {@link Integer int}
     * @return Devuelve un texto en formato {@link StringBuilder StringBuilder}
     */
    public static StringBuilder repetirFrase(StringBuilder frase, int veces) {
        StringBuilder mensaje = new StringBuilder();

        for (int i = 0; i < veces; i++) {
            mensaje.append(frase).append("\n");
        }
        return mensaje;
    }


    /**
     * @param frase Ingrese el texto en formato {@link String String}
     * @return Devuelve la frase, pero cada palabra está separada por un salto de línea
     */
    public static String separadorPalabrasPorLineas(String frase) {
        StringBuilder sb = new StringBuilder();
        String entrega;
        String[] array = frase.split("\\s+|\n|,");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]).append("\n");
        }
        entrega = sb.toString();
        return entrega;
    }


    /**
     * @param frase frase en formato {@link  String String}
     * @return Devuelve un {@link  String String} con una tabla por palabras con el respectivo
     * número de letras por palabras
     */
    public static String contadorLetrasPorPalabra(String frase) {
        StringBuilder sb = new StringBuilder();
        String palabra = "";
        frase = frase.trim();
        String[] array = frase.split("\\s+|\n|,");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > palabra.length()) {
                palabra = array[i];
            }
        }
        int palabraMasLarga = palabra.length();
        sb = sb.append(String.format("|| %-" + (palabraMasLarga + 3) + "s||%" + (palabraMasLarga + 3) + "s ||", "palabras", "letras")).append("\n");
        for (int i = 0; i < array.length; i++) {
            int numero = array[i].length();
            sb = sb.append(String.format("|| %-" + (palabraMasLarga + 3) + "s||%" + (palabraMasLarga + 3) + "d ||", array[i], numero)).append("\n");
        }
        return sb.toString();
    }

    /**
     * @param frase Ingresa un texto en formato {@link String String}
     * @return Devuelve el texto en formato {@link String String} solo con
     * las posiciones impares
     */
    public static String fraseEnPosicionImpar(String frase) {
        int largo = frase.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < largo; i++) {
            sb.append(frase.charAt(i));
            i++;
        }
        return sb.toString();
    }

    /**
     * @param frase Ingrese una frase en formato {@link String String}
     * @return devuelve un {@link String String} diciendo si en la
     * frase hay una palabra palíndroma o no y en caso de ser afirmativo
     * dice cuál es la palabra
     */
    public static String palabraPalindromaEnFrase(String frase) {
        String[] array = frase.split("\\s+|\n|,");
        String palabra;
        int distancia = 1;
        String palindroma = "";
        char c1, c2;
        for (int i = 0; i < array.length; i++) {
            distancia = 0;
            palabra = array[i];
            for (int j = 0; j < palabra.length() / 2; j++) {
                c1 = palabra.charAt(j);
                c2 = palabra.charAt(palabra.length() - 1 - j);
                if (c1 == c2) {
                    distancia = 0;
                } else {
                    distancia++;
                }
            }
            if (distancia == 0) {
                palindroma = "La frase tiene la palabra " + palabra + " como palíndroma";
                break;
            }
        }
        if (distancia != 0) {
            palindroma = "No hay ninguna palabra palíndroma";
        }
        return palindroma;
    }


    /**
     * @param nombre          Nombre ingresado
     * @param primerApellido  Primer apellido ingresado
     * @param segundoApellido Segundo apellido ingresado
     */
    public static void concentrador(String nombre, String primerApellido, String segundoApellido) {
        String nombreStr = nombre + " " + primerApellido + " " + segundoApellido;

        System.out.println(nombreCompletoEnMayusculasMinusculasYLongitud(nombreStr));
        primerosCincoCaracteres(nombreStr);

        System.out.println("Hay " + ocurrenciasDeUltimoCaracter(nombreStr) + " ocurrencias en el nombre completo");
        System.out.println(ocurrenciaPrimeraLetraEnMayuscula(nombreStr));
        System.out.println(cadenaConSimbolosDelanteDetras(nombreStr));
        System.out.println(cadenaInvertida(nombreStr));
    }

    /**
     * @param nombreComppleto Nombre con apellidos en formato {@link String String}
     * @return Devuelve un String con toda la información necesaria
     */
    public static String nombreCompletoEnMayusculasMinusculasYLongitud(String nombreComppleto) {
        String nombreMayusculas, nombreMinusculas;
        int longitud;
        nombreMayusculas = nombreComppleto.toUpperCase();
        nombreMinusculas = nombreComppleto.toLowerCase();
        longitud = nombreComppleto.length();
        return "El nombre completo en mayusculas " + nombreMayusculas +
                ".\nEl nombre en minusculas " + nombreMinusculas +
                "\nLa longitud del nombre completo " + longitud;
    }


    /**
     * @param nombreComppleto El nombre completo en formato {@link String String}
     */
    public static void primerosCincoCaracteres(String nombreComppleto) {
        StringBuilder letras = new StringBuilder();
        if (nombreComppleto.length() > 5) {
            for (int i = 0; i < 5; i++) {
                letras.append(nombreComppleto.charAt(i));
            }
            System.out.println(letras);
        } else {
            System.err.println("Error, el nombre no cumple el tamaño minimo de 5 caracteres");
        }
    }


    /**
     * cuenta las ocurrencias de la ultima letra del texto
     *
     * @param texto Ingrese el texto en formato {@link  String String}
     * @return Devuelve un numero de tipo {@link Integer int}
     */
    public static int ocurrenciasDeUltimoCaracter(String texto) {
        char ultimaLetra;
        ultimaLetra = texto.charAt(texto.length() - 1);
        int ocurrencias = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (ultimaLetra == texto.charAt(i)) {
                ocurrencias++;
            }
        }
        return ocurrencias;

    }


    /**
     * Ingresa el texto y devuelve la frase pero la primera letra y
     * las que coincidan en maysculas
     *
     * @param texto Ingrese el texto en formaro {@link String String}
     * @return Devuelve todas las letras que coincidan con la primera
     * por la letra en mayusculas
     */
    public static String ocurrenciaPrimeraLetraEnMayuscula(String texto) {
        char primeraLetra = texto.charAt(0);
        String str = Character.toString(primeraLetra);
        String mensaje;

        mensaje = texto.replaceAll(str, String.valueOf(Character.toUpperCase(primeraLetra)));

        return mensaje;
    }

    /**
     * @param texto Texto en formato {@link String String}
     * @return devuelve *** texto ***
     */
    public static String cadenaConSimbolosDelanteDetras(String texto) {
        return "***" + " " + texto + " " + "***";
    }


    /**
     * @param texto Ingrese el texto en formato {@link String String}
     * @return Devuelve la cadena en formato {@link String String} a la inversa
     */
    public static String cadenaInvertida(String texto) {
        StringBuilder sb = new StringBuilder();
        sb.append(texto);
        return sb.reverse().toString();
    }


    /**
     * @param texto Ingrese el texto En formato {@link String String}
     * @return devuelve el texto remplazado es -> no por
     */
    public static String sustituirPartesDeFrase(String texto) {
        texto = texto.replaceAll("es", "no por");
        texto = texto.replaceAll("\\d+", "*");
        return texto;
    }

    /**
     * @return Devuelve la palabra más larga
     */
    public static String palabraMasLarga() {
        String palabra1, palabra2, palabra3;
        String mensaje = "La palabra más larga es: ";
        palabra1 = StringLib.ingresarTexto("Ingrese la primera palabra: ");
        palabra2 = StringLib.ingresarTexto("Ingrese la segunda palabra: ");
        palabra3 = StringLib.ingresarTexto("Ingrese la tercera palabra: ");

        int p1 = palabra1.length();
        int p2 = palabra2.length();
        int p3 = palabra3.length();

        if (p1 > p2 && p1 > p3) {
            return mensaje + palabra1;
        } else if (p2 > p1 && p2 > p3) {
            return mensaje + palabra2;
        } else {
            return mensaje + palabra3;
        }

    }


    /**
     * @return Devuelve la palabra mas corta
     */
    public static String palabraMasCorta() {
        String palabra1, palabra2, palabra3;
        String mensaje = "La palabra más corta es: ";
        palabra1 = StringLib.ingresarTexto("Ingrese la primera palabra: ");
        palabra2 = StringLib.ingresarTexto("Ingrese la segunda palabra: ");
        palabra3 = StringLib.ingresarTexto("Ingrese la tercera palabra: ");

        int p1 = palabra1.length();
        int p2 = palabra2.length();
        int p3 = palabra3.length();

        if (p1 < p2 && p1 < p3) {
            return mensaje + palabra1;
        } else if (p2 < p1 && p2 < p3) {
            return mensaje + palabra2;
        } else {
            return mensaje + palabra3;
        }

    }


    /**
     * @return devuelve el numero de vocales en formato {@link  String String}
     */
    public static String numerosDeVocales() {
        int vocales = 0;
        String frase = StringLib.ingresarFrase();
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.charAt(i)) {
                case 'a', 'á', 'à', 'ä', 'e', 'è', 'é', 'ë', 'i', 'ì', 'í', 'ï',
                     'o', 'ó', 'ò', 'ö', 'u', 'ù', 'ú', 'ü' -> vocales += 1;
            }
        }
        return "Hay " + vocales + " vocales";
    }
}