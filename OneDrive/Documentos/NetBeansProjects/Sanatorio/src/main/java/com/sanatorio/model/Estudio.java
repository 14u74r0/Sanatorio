package com.sanatorio.model;

public class Estudio {
    private String tipoSangre;
    private Pacientes paciente;
    private int fecha;
    private String DetallesResultado;
    
    public Estudio(String tipoSangre, Pacientes paciente, int fecha, String DetallesResultado) {
        this.tipoSangre = tipoSangre;
        this.paciente= paciente;
        this.fecha = fecha;
        this.DetallesResultado= DetallesResultado;
    }
    
    public String getTipoSangre() {
        return tipoSangre;
    }
    
    public Pacientes getPacientes() {
        return paciente;
    }
    
    public int getFecha() {
        return fecha;
    }
    
    public String getDetallesResultado() {
        return DetallesResultado;
    }
    
    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }
}
