package com.api.Fresh_Smile_Cmills.Service.PacienteServiceIMPL;
import com.api.Fresh_Smile_Cmills.Entity.Paciente;
import com.api.Fresh_Smile_Cmills.Repository.PacienteRepo;
import com.api.Fresh_Smile_Cmills.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceIMPL implements PacienteService {
    @Autowired
    private PacienteRepo repo;
    @Override
    public List<Paciente> ConsultarPaciente() {
        return (List<Paciente>)this.repo.findAll();
    }

    @Override
    public Paciente CrearPaciente(Paciente paciente) {
       paciente.setNumero_documento_paciente( paciente.getNumero_documento_paciente());
        return this.repo.save(paciente);
    }

    @Override
    public Paciente ModificarPaciente(Paciente paciente) {
        return this.repo.save(paciente);
    }

    @Override
    public Paciente BuscarPaciente(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarPaciente(int id) {
        this.repo.deleteById(id);
    }
    @Override
    public List<Paciente> ConsultarPacientesEliminados() {
        return PacienteRepo.ConsultarPacientesEliminados();
    }


}