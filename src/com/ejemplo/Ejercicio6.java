//Imprimir a la inversa la cadena de texto "Mensaje de Texto".


package com.ejemplo;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        String texto = "Mensaje de Texto";

        for(int i = texto.length()-1; i >= 0; i--){
            System.out.println(texto.charAt(i));
        }

    }

}
