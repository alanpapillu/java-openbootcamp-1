package com.ejemplo.ejercicioPoo;

public abstract class SmartDevice {

    protected String modelo;
    protected String marca;
    protected String bateria;
    protected double valor;

    public SmartDevice(String modelo, String marca, String bateria, double valor) {
        this.modelo = modelo;
        this.marca = marca;
        this.bateria = bateria;
        this.valor = valor;
    }

    public SmartDevice(){

    }
    
    
}
