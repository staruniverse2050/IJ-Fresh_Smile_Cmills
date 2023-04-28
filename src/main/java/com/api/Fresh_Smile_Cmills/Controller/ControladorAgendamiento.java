package com.api.Fresh_Smile_Cmills.Controller;

import com.api.Fresh_Smile_Cmills.Entity.Administrador;
import com.api.Fresh_Smile_Cmills.Entity.Agendamiento;
import com.api.Fresh_Smile_Cmills.Service.AgendamientoServiceIMPL.AgendamientoServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("CRUDRepo")
public class ControladorAgendamiento {

    @Autowired
    private AgendamientoServiceIMPL impl;

    @GetMapping
    @RequestMapping(value = "ConsultarAgendamientos", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarAgendamientos() {
        List<Agendamiento> listaAgendamiento = this.impl.ConsultarAgendamiento();
        return ResponseEntity.ok(listaAgendamiento);
    }

    @PostMapping
    @RequestMapping(value = "CrearAgendamientos", method = RequestMethod.POST)
    public ResponseEntity<?> CrearAgendamientos(@RequestBody Agendamiento agendamiento) {
        Agendamiento AgendamientoCreado = this.impl.CrearAgendamiento(agendamiento);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Agendamiento creado con éxito");
        response.put("AgendamientoCreado", AgendamientoCreado);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping
    @RequestMapping(value = "ModificarAgendamientos", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarAgendamientos(@RequestBody Agendamiento agendamiento) {
        Agendamiento AgendamientoModificado = this.impl.ModificarAgendamiento(agendamiento);
        String message = "Agendamiento modificado con éxito.";
        Map<String, Object> response = new HashMap<>();
        response.put("message", message);
        response.put("agendamiento", AgendamientoModificado);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping
    @RequestMapping(value = "BuscarAgendamientos/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarAgendamientos(@PathVariable int id) {
        Agendamiento agendamiento = this.impl.BuscarAgendamiento(id);
        return ResponseEntity.ok(agendamiento);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarAgendamiento/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarAgendamiento(@PathVariable int id) {
        Agendamiento agendamientoEliminado = this.impl.BuscarAgendamiento(id);
        this.impl.EliminarAgendamiento(id);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Agendamiento eliminado con éxito");
        response.put("agendamientoEliminado", agendamientoEliminado);
        return ResponseEntity.ok().body(response);
}
}
