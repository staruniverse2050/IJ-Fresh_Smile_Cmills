package com.api.Fresh_Smile_Cmills.Controller;


import com.api.Fresh_Smile_Cmills.Entity.Paciente;
import com.api.Fresh_Smile_Cmills.Service.PacienteServiceIMPL.PacienteServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @RequestMapping(value = "CrearPersonas",method = RequestMethod.POST)
    public ResponseEntity<?>CrearPersonas(@RequestBody Paciente paciente){
        Paciente PersonaCreada=this.impl.CrearPaciente(paciente);
        return ResponseEntity.status(HttpStatus.CREATED).body(PersonaCreada);
    }

    @PutMapping
    @RequestMapping(value = "ModificarPersonas",method = RequestMethod.PUT)
    public ResponseEntity<?>ModificarPersonas(@RequestBody Paciente paciente){
        Paciente PacienteModificado=this.impl.ModificarPaciente(paciente);
        return ResponseEntity.status(HttpStatus.CREATED).body(PacienteModificado);
    }
    @GetMapping
    @RequestMapping(value = "BuscarPacientes/{id}",method = RequestMethod.GET)
    public ResponseEntity<?>BuscarPacientes(@PathVariable int id){
        Paciente persona=this.impl.BuscarPaciente(id);
        return ResponseEntity.ok(persona);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarPacientes/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?>EliminarPacientes(@PathVariable int id){
        this.impl.EliminarPaciente(id);
        return ResponseEntity.ok().build();
    }

}
