package com.sanatorio.model;


public class Dieta {
    private String tipo;
    private String descripcion;
    
    public Dieta(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
