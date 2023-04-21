package com.api.Fresh_Smile_Cmills.Service.AdministradorServiceIMPL;

import com.api.Fresh_Smile_Cmills.Entity.Administrador;
import com.api.Fresh_Smile_Cmills.Repository.AdministradorRepo;
import com.api.Fresh_Smile_Cmills.Service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministradorServiceIMPL implements AdministradorService {
@Autowired
private AdministradorRepo repo;

    @Override
    public List<Administrador> ConsultarAdministrador() {
        return (List<Administrador>) this.repo.findAll();
    }

    @Override
    public Administrador CrearAdministrador(Administrador administrador) {
        administrador.setNumero_documento_uadministrador(administrador.getNumero_documento_uadministrador());
        return this.repo.save(administrador);
    }

    @Override
    public Administrador ModificarAdministrador(Administrador administrador) {
        return this.repo.save(administrador);
    }

    @Override
    public Administrador BuscarAdministrador(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarAdministrador(int id) {
        this.repo.deleteById(id);
    }
}
