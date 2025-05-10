package com.sanatorio.model.administracion;

import com.sanatorio.model.Pacientes;
import com.sanatorio.model.ObraSocial;
import com.sanatorio.model.Vademecum;

import java.util.List;

public class DepartamentoAdministracion {
    private List<Pacientes> pacientes;
    private List<ObraSocial> obrasSociales;
    private List<Vademecum> vademecums;

    public DepartamentoAdministracion(List<Pacientes> pacientes, List<ObraSocial> obrasSociales, List<Vademecum> vademecums) {
        this.pacientes = pacientes;
        this.obrasSociales = obrasSociales;
        this.vademecums = vademecums;
    }

    public String obtenerCoberturaOS(Pacientes paciente) {
        for (ObraSocial os : obrasSociales) {
            if (os.getNombre().equals(paciente.getObraSocial())) {
                return os.getCobertura();
            }
        }
        return "Obra Social no encontrada.";
    }

    public double obtenerDescuentoOS(Pacientes paciente) { 
        for (ObraSocial os : obrasSociales) {
            if (os.getNombre().equals(paciente.getObraSocial())) {
                return os.getDescuento();
            }
        }
        return 0.0;
    }

    public Vademecum buscarMedicamentos(String nombreMedicamento) {
        for (Vademecum medicamento : vademecums) {
            if (medicamento.getNombre().equalsIgnoreCase(nombreMedicamento)) {
                return medicamento;
            }
        }
        return null;
    }
}