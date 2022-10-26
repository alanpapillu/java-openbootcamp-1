package com.ejerciciosAvanzados;

import java.util.Scanner;

/* Una pequeña despensa desea calcular el sueldo de sus empleados. Los puestos de los mismos pueden tener
 * tres categorias: repositor, cajero y supervisor.
 * 
 * Los repositores cobran $15.890 + bono de 10%
 * Los cajeros cobran $25.630,89 fijos.
 * Los supervisores cobran $35.560,20 en bruto, al cual se les descuentan un 11% por jubilación.
 * 
 * Se necesita una aplicación que, dependiendo el tipo de empleado, calcule y muestre en pantalla
 * el sueldo correspondiente.
 */

public class EjercicioCondicionales {

    public static void main(String[] args) {

        double sueldo = 0;
        
        System.out.println("Ingrese la categoría del empleado");

        Scanner teclado = new Scanner(System.in);
        int categoria = teclado.nextInt();

        if (categoria == 1){
            sueldo = 15890 * 1.1;
        } else if (categoria == 2){
            sueldo = 25630.89;
        } else if(categoria == 3) {
            sueldo = 35560.20 * 0.89;
        } else {
            System.out.println("El número de categoría es incorrecto");
        }

        if(categoria == 1 || categoria == 2 || categoria == 3){
            System.out.println("El número de categoría es " + categoria);
            System.out.println("El sueldo es de " + sueldo);
        } 

        teclado.close();
    }
    
}
