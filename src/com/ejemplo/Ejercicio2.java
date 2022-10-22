package com.ejemplo;

//Enunciado: Para este ejercicio tendréis que crear una función que 
// reciba un precio y devuelva el precio con el IVA incluido.

public class Ejercicio2 {
    
    public static void main(String[] args) {

        double precio = 100;

        double precioFinal = precioConIva(precio);
        System.out.println(precioFinal);

    }

    static double precioConIva(double precio) {
        return precio * 1.21;
    }

}
