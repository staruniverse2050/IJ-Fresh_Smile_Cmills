package com.api.Fresh_Smile_Cmills.Entity;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name = "agendamiento")
public class Agendamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_agendamiento")
    private int id_agendamiento;
    @Column(name = "total")
    private String total;
    @Column(name = "hora_cita")
    private Time hora_cita;
    @Column(name = "fecha_cita")
    private Date fecha_cita;
    @Column(name = "id_paciente1")
    private int id_paciente1;
    @Column(name = " id_administrador1")
    private String  id_administrador1;

    public int getId_agendamiento() {
        return id_agendamiento;
    }

    public void setId_agendamiento(int id_agendamiento) {
        this.id_agendamiento = id_agendamiento;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Time getHora_cita() {
        return hora_cita;
    }

    public void setHora_cita(Time hora_cita) {
        this.hora_cita = hora_cita;
    }

    public Date getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(Date fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public int getId_paciente1() {
        return id_paciente1;
    }

    public void setId_paciente1(int id_paciente1) {
        this.id_paciente1 = id_paciente1;
    }

    public String getId_administrador1() {
        return id_administrador1;
    }

    public void setId_administrador1(String id_administrador1) {
        this.id_administrador1 = id_administrador1;
    }
}

