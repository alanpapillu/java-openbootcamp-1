package com.ejerciciosAvanzados;

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
        
        Repositor repositor = new Repositor("Juan Gomez", "repositor", 15890, 1.1);

        repositor.calcularSueldo();

        Cajero cajero = new Cajero("Juana Perez", "cajero", 25630.89);

        cajero.calcularSueldo();

        Supervisor supervisor = new Supervisor("Pedro Ruiz", "supervisor", 35560.20);

        supervisor.calcularSueldo();



    }
    
}
