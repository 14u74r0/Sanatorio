package com.sanatorio.model.nutricion;

import com.sanatorio.model.Pacientes;
import com.sanatorio.model.PacienteInternado;
import com.sanatorio.model.PacientePediatrico;
import com.sanatorio.model.Dieta;
import java.util.List;


public class DepaNutricion {
    private List<Dieta> dietas;
    private List<Pacientes> pacientes; 
    
    public DepaNutricion(List<Dieta> dietas, List<Pacientes> paciente) {
        this.dietas = dietas;
        this.pacientes = pacientes;
    }
    
    public Dieta obtenerDieta(Pacientes paciente) {
        if (paciente instanceof PacienteInternado) {
            return null;
        } else if (paciente instanceof PacientePediatrico) {
            return null;
        }
        return null;
    }
    
    public void asignarDieta(Pacientes paciente, Dieta dieta) {
        if (paciente instanceof PacienteInternado) {
            System.out.println("Dieta: " + dieta.getTipo() + "asignada al paciente internado" + paciente.getNombre());   
        } else if (paciente instanceof PacientePediatrico) {
            System.out.println("Dieta: " + dieta.getTipo() + "asignada al paciente pediatrico" + paciente.getNombre());
        } else {
            System.out.println("Los pacientes adultos no tienen dietas asignadas por este departamento.");
        }
    }
}
