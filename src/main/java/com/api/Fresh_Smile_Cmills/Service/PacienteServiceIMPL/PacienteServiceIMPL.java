package com.api.Fresh_Smile_Cmills.Service.PacienteServiceIMPL;
import com.api.Fresh_Smile_Cmills.Entity.Paciente;
import com.api.Fresh_Smile_Cmills.Repository.PacienteRepo;
import com.api.Fresh_Smile_Cmills.Service.PacienteService;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<Paciente> optional = this.repo.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new RuntimeException("Paciente no encontrado con id: " + id);
        }
    }

    @Override
    public void EliminarPaciente(int id) {
        this.repo.deleteById(id);
    }
    @Autowired
    private EntityManager entityManager;
    @Transactional
    public void actualizarEstadoPaciente(Paciente paciente) {
        entityManager.merge(paciente);
    }
}