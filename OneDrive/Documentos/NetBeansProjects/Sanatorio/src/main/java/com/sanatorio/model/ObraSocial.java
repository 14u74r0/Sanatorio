package com.sanatorio.model;

public class ObraSocial {
    private String nombre;
    private String cobertura;
    private double descuento;
    
    public ObraSocial(String nombre, String cobertura, double descuento) {
        this.nombre = nombre;
        this.cobertura = cobertura;
        this.descuento = descuento;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getCobertura() {
        return cobertura;
    }
    
    public double getDescuento() {
        return descuento;
    }
    
    
    public void setDescuento(double decuento) {
        this.descuento = descuento;
    }
}
