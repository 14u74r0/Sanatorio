
package com.sanatorio.model;

public class PacientePediatrico extends Pacientes{
    private double peso;
    private String celularTutor;
    private String tutor;
    
    public PacientePediatrico(int dni, String nombre, String obraSocial, double peso, String celularTutor, String tutor) {
        super(dni, nombre, obraSocial);
        this.peso = peso;
        this.celularTutor = celularTutor;
        this.tutor = tutor;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public String getCelularTutor() {
        return celularTutor;
    }
    
    public String getTutor() {
        return tutor;
    }
    
    
    public String obteneInformacionEspecifica() {
        return "Peso: " + peso + "kg, Tutor: " + tutor + ", Celular del Tutor: " + celularTutor + ".";
    }
}
