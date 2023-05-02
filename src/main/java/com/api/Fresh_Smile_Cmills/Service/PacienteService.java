package com.api.Fresh_Smile_Cmills.Service;
import com.api.Fresh_Smile_Cmills.Entity.Paciente;
import java.util.List;

public interface PacienteService {
    public List<Paciente> ConsultarPaciente();
    public Paciente CrearPaciente(Paciente paciente);
    public Paciente ModificarPaciente(Paciente paciente);
    public Paciente BuscarPaciente(int id);
    public void EliminarPaciente(int id);

    static List<Paciente> ConsultarPacientesEliminados() {
        return null;
    }

}
