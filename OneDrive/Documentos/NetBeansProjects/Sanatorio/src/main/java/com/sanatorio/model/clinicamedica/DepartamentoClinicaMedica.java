package com.sanatorio.model.clinicamedica;

import com.sanatorio.model.Pacientes;
import com.sanatorio.model.PacienteAdulto;
import com.sanatorio.model.PacienteInternado;
import com.sanatorio.model.Estudio;

import java.util.List;


public class DepartamentoClinicaMedica {
    private List<Estudio> estudiosRealizados;
    
    public DepartamentoClinicaMedica(List<Estudio> estudiosRealizados) {
        this.estudiosRealizados = estudiosRealizados;
    }
    
    public void recetarEstudio(Pacientes paciente, String tipoEstudio) {
        if (paciente instanceof PacienteAdulto || paciente instanceof PacienteInternado) {
            if (tipoEstudio.equalsIgnoreCase("tipoSangre") || tipoEstudio.equalsIgnoreCase("Sangre")) {
                Estudio nuevoEstudio = new Estudio(tipoEstudio, paciente, 0, "");
                System.out.println("Tipo de estudio no valido.");
            }
            }else{
                System.out.println("Los estudios solo se pueden recetar a pacientes adultos e internados");
        }
    }
    
    public List<Estudio> obtenerEstudiosDelPaciente(Pacientes paciente) {
        return estudiosRealizados.stream()
                .filter(estudio -> estudio.getPacientes().equals(paciente))
                .toList();
    }
}
