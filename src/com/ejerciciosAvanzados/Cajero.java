package com.ejerciciosAvanzados;

public class Cajero extends Empleado{

    public Cajero(String nombre, String tipo, double sueldo) {
        super(nombre, tipo, sueldo);

    }
    
    public void calcularSueldo(){
        System.out.println("El sueldo para " + tipo + " es " + sueldo);
    }
}
