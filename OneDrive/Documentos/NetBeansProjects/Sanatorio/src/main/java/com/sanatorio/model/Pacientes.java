package com.sanatorio.model;

public class Pacientes {
   private int dni;
   private String nombre;
   private String obraSocial;
   
   public Pacientes(int dni, String nombre, String obraSocial) {
       this.dni = dni;
       this.nombre = nombre;
       this.obraSocial = obraSocial;
   }
   
   public int getDni() {
       return dni;
   }
   
   public String getNombre() {
       return nombre;
   }
   
   public String getObraSocial() {
       return obraSocial;
   }
   
   public void setObraSocial(String obraSocial) {
       this.obraSocial = obraSocial;
   }
}
