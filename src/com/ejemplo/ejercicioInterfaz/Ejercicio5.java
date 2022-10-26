package com.ejemplo.ejercicioInterfaz;

/*Crear una interfaz CocheCRUD.

Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.

Como métodos de CocheCRUD podemos poner:

save() findAll() delete() que simplemente impriman por consola el nombre del propio método.

Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos. */

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        CocheCRUDImpl coche1 = new CocheCRUDImpl();

        coche1.save(null);
        coche1.findAll();
        coche1.delete(null);

    }

}
