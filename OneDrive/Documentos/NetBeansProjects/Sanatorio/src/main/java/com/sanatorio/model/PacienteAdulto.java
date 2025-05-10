package com.sanatorio.model;


public class PacienteAdulto extends Pacientes{
    private int presionArterial;
    private double altura;
    private double peso;
    
    public PacienteAdulto(int dni, String nombre, String obraSocial, int presionArterial, double altura, double peso) {
        super(dni, nombre, obraSocial);
        this.presionArterial = presionArterial;
        this.altura = altura;
        this.peso = peso;
    }
    
    public int getPresionArterial() {
        return presionArterial;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public double getPeso() {
        return peso;
    }
    
    
    public String ObtenerInformacionEspecifica() {
        return "Presion Arterial: " + presionArterial + ", altura: " + altura + ", peso: " + peso + ".";
    }
}
