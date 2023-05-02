package com.api.Fresh_Smile_Cmills.Controller;


import com.api.Fresh_Smile_Cmills.Entity.Paciente;
import com.api.Fresh_Smile_Cmills.Service.PacienteService;
import com.api.Fresh_Smile_Cmills.Service.PacienteServiceIMPL.PacienteServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("FreshSmile")
public class ControladorPaciente {

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
    @DeleteMapping("EliminarPacientes/{id}")
    public ResponseEntity<Map<String, Object>> eliminarPaciente(@PathVariable int id) {
        Paciente pacienteEliminado = impl.BuscarPaciente(id);
        impl.EliminarPaciente(id);

        Map<String, Object> response = new HashMap<>();
        response.put("message", "Paciente eliminado con éxito");
        response.put("pacienteEliminado", pacienteEliminado);

        return ResponseEntity.ok().body(response);    }

    @GetMapping("/pacientesEliminados")
    public ResponseEntity<List<Paciente>> consultarPacientesEliminados() {
        List<Paciente> pacientesEliminados = PacienteService.ConsultarPacientesEliminados();
        return ResponseEntity.ok(pacientesEliminados);
    }



}


