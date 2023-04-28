package com.api.Fresh_Smile_Cmills.Service.AgendamientoServiceIMPL;

import com.api.Fresh_Smile_Cmills.Entity.Agendamiento;
import com.api.Fresh_Smile_Cmills.Repository.AgendamientoRepo;
import com.api.Fresh_Smile_Cmills.Service.AgendamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamientoServiceIMPL implements AgendamientoService {
@Autowired
private AgendamientoRepo repo;

    @Override
    public List<Agendamiento> ConsultarAgendamiento() {
        return (List<Agendamiento>) this.repo.findAll();
    }

    @Override
    public Agendamiento CrearAgendamiento(Agendamiento agendamiento) {
        agendamiento.setId_agendamiento(agendamiento.getId_agendamiento());
        return this.repo.save(agendamiento);
    }

    @Override
    public Agendamiento ModificarAgendamiento(Agendamiento agendamiento) {
        return this.repo.save(agendamiento);
    }

    @Override
    public Agendamiento BuscarAgendamiento(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarAgendamiento(int id) {
this.repo.deleteById(id);
    }
}
