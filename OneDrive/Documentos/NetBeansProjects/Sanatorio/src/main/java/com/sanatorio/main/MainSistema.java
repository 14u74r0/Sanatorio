package com.sanatorio.main;

import com.sanatorio.model.PacienteAdulto;
import com.sanatorio.model.administracion.DepartamentoAdministracion;
import com.sanatorio.model.clinicamedica.DepartamentoClinicaMedica;
import com.sanatorio.model.*;
import java.util.ArrayList;
import java.util.List;

public class MainSistema {
    public static void main(String[] args) {
        
        ObraSocial os1 = new ObraSocial("OSDE", "Plan 210", 0.10);
        ObraSocial os2 = new ObraSocial("IOSFA", "SMG 50", 0.15);
        List<ObraSocial> obrasSociales = new ArrayList<>();
        obrasSociales.add(os1);
        obrasSociales.add(os2);
        
        
        PacienteAdulto paciente1 = new PacienteAdulto (123456789, "Juan Perez", "Osde", 120, 1.80, 80.5);
        PacientePediatrico paciente2 = new PacientePediatrico (123456349 , "Ana Garcia", "IOSFA", 30.2, "333-456", "Maria Lopez");
        List<Pacientes> pacientes = new ArrayList<>();
        pacientes.add(paciente1);
        pacientes.add(paciente2);
        
        
        Vademecum medicamento1 = new Vademecum("Paracetamol", "Analgesico", 100.0);
        Vademecum medicamento2 = new Vademecum("Amoxcilina", "Antibiotico", 250.0);
        List<Vademecum> vademecums = new ArrayList<>();
        vademecums.add(medicamento1);
        vademecums.add(medicamento2);
        
        
        List<Estudio> estudiosRealizados = new ArrayList<>();
        
        DepartamentoAdministracion administracion = new DepartamentoAdministracion(pacientes, obrasSociales, vademecums);
        DepartamentoClinicaMedica clinica = new DepartamentoClinicaMedica(estudiosRealizados);
        
        String coberturaPaciente1 = administracion.obtenerCoberturaOS(paciente1);
        System.out.println("Cobertura de " + paciente1.getNombre() + ": " + coberturaPaciente1);
        
        Vademecum medicamentoBuscado = administracion.buscarMedicamentos("paracetamol");
        if (medicamentoBuscado != null) {
            System.out.println("Medicamento encontrado: "+ medicamentoBuscado.getNombre() + " - " + medicamentoBuscado.getDescripcion());
        }else{
            System.out.println("Medicamento no encontrado.");
        }
        
        clinica.recetarEstudio(paciente1, "Rx");
        clinica.recetarEstudio(paciente2, "Laboratorio");
        
        List<Estudio> estudiosDePaciente1 = clinica.obtenerEstudiosDelPaciente(paciente1);
        System.out.println("Estudios de " + paciente1.getNombre() + ": " + estudiosDePaciente1.size());
    }
}