package com.ejemplo.ejercicioPoo;

public class SmartWatch extends SmartDevice {
    
    protected String color;
    protected String tamaño;
    
    public SmartWatch() {
    }

    public SmartWatch(String modelo, String marca, String bateria, double valor, String color, String tamaño) {
        super(modelo, marca, bateria, valor);
        this.color = color;
        this.tamaño = tamaño;
    }

}
