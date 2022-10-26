package com.ejemplo.ejercicioPoo;

/*Crear una clase base que sea SmartDevice
 * Crear las clases hijas SmartPhone y SmartWatch
 * Crear atributos que tendrían en la realidad
 * Crear constructor vacío y con los parámetros
 * Crear objetos de cada una y utilizarlos para imprimir sus valore por consola
 */

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        SmartPhone smartSamsung = new SmartPhone("Galaxy", "Samsung", "3 celdas", 1000, "64 GB", "13MP");

        SmartWatch smartMotorola = new SmartWatch("G58X", "Motorola", "2 celdas", 900, "Negro", "2 pulgadas");

        System.out.println(smartSamsung);
        System.out.println(smartMotorola);
    }

}
