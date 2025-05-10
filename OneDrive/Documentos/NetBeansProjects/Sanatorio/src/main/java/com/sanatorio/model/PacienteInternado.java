package com.sanatorio.model;

public class PacienteInternado extends Pacientes{
    private int habitacion;
    private int presionArterial;
    private String RH;
    
    public PacienteInternado(int dni, String nombre, String obraSocial, int habitacion, int presionArterial, String RH) {
        super(dni, nombre, obraSocial);
        this.habitacion = habitacion;
        this.presionArterial = presionArterial;
        this.RH = RH;
    }
    
    public int getHabitacion() {
        return habitacion;
    }
    
    public int getPresionArterial() {
        return presionArterial;
    }
    
    public String getRH() {
        return RH;
    }
    
    public String ObtenerInformacionEspecifica() {
        return "Numero de habitacion: " + habitacion + ", presion arterial es de: " + presionArterial + "y su tipo de sangre es: " + RH + ".";
    }
}
