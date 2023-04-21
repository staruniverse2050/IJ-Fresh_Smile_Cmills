package com.api.Fresh_Smile_Cmills.Controller;


import com.api.Fresh_Smile_Cmills.Entity.Paciente;
import com.api.Fresh_Smile_Cmills.Service.PacienteServiceIMPL.PacienteServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("CRUDRepo")
public class Controlador {

    @Autowired
    private PacienteServiceIMPL impl;
    @GetMapping
    @RequestMapping(value = "ConsultarPacientes",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarPacientes(){
        List<Paciente> listarPaciente=this.impl.ConsultarPaciente();
        return ResponseEntity.ok(listarPaciente);

    }
    @PostMapping
    @RequestMapping(value = "CrearPacientes",method = RequestMethod.POST)
    public ResponseEntity<?>CrearPacientes(@RequestBody Paciente paciente){
        Paciente PacientesCreado=this.impl.CrearPaciente(paciente);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Paciente creado con éxito");
        response.put("pacienteCreado", PacientesCreado);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping
    @RequestMapping(value = "ModificarPacientes",method = RequestMethod.PUT)
    public ResponseEntity<?>ModificarPacientes(@RequestBody Paciente paciente){
        Paciente PacienteModificado=this.impl.ModificarPaciente(paciente);
        String message = "Paciente modificado con éxito.";
        Map<String, Object> response = new HashMap<>();
        response.put("message", message);
        response.put("paciente", PacienteModificado);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping
    @RequestMapping(value = "BuscarPacientes/{id}",method = RequestMethod.GET)
    public ResponseEntity<?>BuscarPacientes(@PathVariable int id){
        Paciente paciente=this.impl.BuscarPaciente(id);
        return ResponseEntity.ok(paciente);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarPacientes/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?>EliminarPacientes(@PathVariable int id){
        Paciente pacienteEliminado = this.impl.BuscarPaciente(id); // obtener los detalles del paciente
        this.impl.EliminarPaciente(id); // eliminar el paciente
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Paciente eliminado con éxito");
        response.put("pacienteEliminado", pacienteEliminado); // agregar los detalles del paciente eliminado al objeto de respuesta
        return ResponseEntity.ok().body(response);
    }

}
