package com.ejemplo;

/*Crear un bucle que permita concatenar textos e imprima el resultado final por consola
 * Concatenar nombres de un array.
 */

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        String[] nombres = {"Juan" , "Pepe" , "Maria"};

        for (String nombre : nombres){
            System.out.println("Los nombres son: " + nombres[0] + ", " + nombres[1] + " y " + nombres[2]);
            break;
            }
    }

}
