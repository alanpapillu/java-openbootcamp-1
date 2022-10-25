package com.ejerciciosAvanzados;

public class Supervisor extends Empleado{

    double jubilacion;

    public Supervisor(String nombre, String tipo, double sueldo) {
        super(nombre, tipo, sueldo);
    }
    

    public void calcularSueldo(){
        double sueldoFinal = sueldo * 0.89;
        System.out.println("El sueldo para " + tipo + " es " + sueldoFinal);
    }
}
