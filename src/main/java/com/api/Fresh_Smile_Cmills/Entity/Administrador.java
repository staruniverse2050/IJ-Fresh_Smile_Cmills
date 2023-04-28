package com.api.Fresh_Smile_Cmills.Entity;


import jakarta.persistence.*;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Entity
@Table(name = "administrador")
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_uadministrador")
    private int id_uadministrador;
    @Column(name = "tipo_documento_uadministrador")
    private String tipo_documento_uadministrador;
    @Column(name = "numero_documento_uadministrador")
    private BigInteger numero_documento_uadministrador;
    @Column(name = "nombres_uadministrador")
    private String nombres_uadministrador;
    @Column(name = "apellidos_uadministrador")
    private String apellidos_uadministrador;
    @Column(name = " direccion_uadministrador")
    private String  direccion_uadministrador;
    @Column(name = "telefono_uadministrador")
    private BigInteger telefono_uadministrador;

    @Column(name = "correo_uadministrador")
    private String correo_uadministrador;

    @Column(name = "contraseña_uadministrador")
    private String contraseña_uadministrador;

    @Column(name = "fecha_registro ")
    private Timestamp fecha_registro ;

    public int getId_uadministrador() {
        return id_uadministrador;
    }

    public void setId_uadministrador(int id_uadministrador) {
        this.id_uadministrador = id_uadministrador;
    }

    public String getTipo_documento_uadministrador() {
        return tipo_documento_uadministrador;
    }

    public void setTipo_documento_uadministrador(String tipo_documento_uadministrador) {
        this.tipo_documento_uadministrador = tipo_documento_uadministrador;
    }

    public BigInteger getNumero_documento_uadministrador() {
        return numero_documento_uadministrador;
    }

    public void setNumero_documento_uadministrador(BigInteger numero_documento_uadministrador) {
        this.numero_documento_uadministrador = numero_documento_uadministrador;
    }

    public String getNombres_uadministrador() {
        return nombres_uadministrador;
    }

    public void setNombres_uadministrador(String nombres_uadministrador) {
        this.nombres_uadministrador = nombres_uadministrador;
    }

    public String getApellidos_uadministrador() {
        return apellidos_uadministrador;
    }

    public void setApellidos_uadministrador(String apellidos_uadministrador) {
        this.apellidos_uadministrador = apellidos_uadministrador;
    }

    public String getDireccion_uadministrador() {
        return direccion_uadministrador;
    }

    public void setDireccion_uadministrador(String direccion_uadministrador) {
        this.direccion_uadministrador = direccion_uadministrador;
    }

    public BigInteger getTelefono_uadministrador() {
        return telefono_uadministrador;
    }

    public void setTelefono_uadministrador(BigInteger telefono_uadministrador) {
        this.telefono_uadministrador = telefono_uadministrador;
    }

    public String getCorreo_uadministrador() {
        return correo_uadministrador;
    }

    public void setCorreo_uadministrador(String correo_uadministrador) {
        this.correo_uadministrador = correo_uadministrador;
    }

    public String getContraseña_uadministrador() {
        return contraseña_uadministrador;
    }

    public void setContraseña_uadministrador(String contraseña_uadministrador) {
        this.contraseña_uadministrador = contraseña_uadministrador;
    }

    public void setFecha_registro_administrador(Timestamp fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getFechaRegistro() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(fecha_registro);
    }
}
