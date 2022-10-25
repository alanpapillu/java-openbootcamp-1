package com.ejerciciosAvanzados;

public abstract class Empleado {

    String nombre;
    String tipo;
    double sueldo;
    
    public Empleado(String nombre, String tipo, double sueldo){
        this.nombre = nombre;
        this.tipo = tipo;
        this.sueldo = sueldo;
    }

    public void calcularSueldo(String nombre, double sueldo){
        double sueldoFinal = 0;
        System.out.println("El sueldo para " + tipo + " es " + sueldoFinal);
    }
}
