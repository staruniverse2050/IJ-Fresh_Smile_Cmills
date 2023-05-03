package com.api.Fresh_Smile_Cmills.Controller;

import com.api.Fresh_Smile_Cmills.Entity.Administrador;
import com.api.Fresh_Smile_Cmills.Service.AdministradorServiceIMPL.AdministradorServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("FreshSmile")
public class ControladorAdministrador {

    @Autowired
    private AdministradorServiceIMPL impl;

    @GetMapping
    @RequestMapping(value = "ConsultarAdministradores", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarAdministradores() {
        List<Administrador> listarAdministrador = this.impl.ConsultarAdministrador();
        return ResponseEntity.ok(listarAdministrador);
    }

    @PostMapping
    @RequestMapping(value = "CrearAdministradores", method = RequestMethod.POST)
    public ResponseEntity<?> CrearAdministradores(@RequestBody Administrador administrador) {
        Administrador AdministradorCreado = this.impl.CrearAdministrador(administrador);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Administrador creado con éxito");
        response.put("AdministradorCreado", AdministradorCreado);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping
    @RequestMapping(value = "ModificarAdministradores",method = RequestMethod.PUT)
    public ResponseEntity<?>ModificarAdministradores(@RequestBody Administrador administrador){
        Administrador AdministradorModificado=this.impl.ModificarAdministrador(administrador);
        String message = "Administrador modificado con éxito.";
        Map<String, Object> response = new HashMap<>();
        response.put("message", message);
        response.put("administrador", AdministradorModificado);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping
    @RequestMapping(value = "BuscarAdministradores/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarAdministradores(@PathVariable int id) {
        Administrador administrador = this.impl.BuscarAdministrador(id);
        return ResponseEntity.ok(administrador);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarAdministradores/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarAdministradores(@PathVariable int id) {
        Administrador administradorEliminado = this.impl.BuscarAdministrador(id);
        this.impl.EliminarAdministrador(id);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Administrador eliminado con éxito");
        response.put("administradorEliminado", administradorEliminado);
        return ResponseEntity.ok().body(response);
    }


}
