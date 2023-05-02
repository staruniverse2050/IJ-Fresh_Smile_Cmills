package com.api.Fresh_Smile_Cmills.Repository;

import com.api.Fresh_Smile_Cmills.Entity.Paciente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PacienteRepo extends CrudRepository<Paciente,Integer> {
    // Consulta para obtener los pacientes eliminados
    @Query("SELECT p FROM Paciente p WHERE p.eliminado = true")
    static List<Paciente> ConsultarPacientesEliminados();

}


