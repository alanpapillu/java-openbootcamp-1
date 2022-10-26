package com.ejemplo.ejercicioPoo;

public class SmartPhone extends SmartDevice {
    
    protected String memoria;
    protected String camara;

    public SmartPhone() {
        
    }
    
    public SmartPhone(String modelo, String marca, String bateria, double valor, String memoria, String camara) {
        super(modelo, marca, bateria, valor);
        this.memoria = memoria;
        this.camara = camara;
    }

    @Override
    public String toString() {
        return "SmartPhone [modelo=" + modelo + ", marca=" + marca + ", bateria=" + bateria + ", valor=" + valor + ", memoria=" + memoria + ", camara=" + camara + "]";
    }



}
