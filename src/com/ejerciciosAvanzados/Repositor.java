package com.ejerciciosAvanzados;

public class Repositor extends Empleado {

    double bono;
    
    public Repositor(String nombre, String tipo, double sueldo, double bono) {
        super(nombre, tipo, sueldo);
        this.bono = bono;
    }

    public void calcularSueldo(){
        double sueldoFinal = sueldo * bono;
        System.out.println("El sueldo para " + tipo + " es " + sueldoFinal);
    }
}
