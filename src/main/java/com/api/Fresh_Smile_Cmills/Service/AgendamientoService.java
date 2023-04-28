package com.api.Fresh_Smile_Cmills.Service;

import com.api.Fresh_Smile_Cmills.Entity.Agendamiento;

import java.util.List;

public interface AgendamientoService {
    public List<Agendamiento>ConsultarAgendamiento();
    public Agendamiento CrearAgendamiento(Agendamiento agendamiento);
    public Agendamiento ModificarAgendamiento(Agendamiento agendamiento);
    public Agendamiento BuscarAgendamiento(int id);
    public void EliminarAgendamiento(int id);
}
