package com.ejemplo.ejercicioInterfaz;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save(Coche coche) {
        System.out.println("Este es el método save");
        
    }

    @Override
    public List<Coche> findAll() {

    System.out.println("Este es el método findAll");
    return null;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("Este es el método delete");
        
    }

    


    
}
