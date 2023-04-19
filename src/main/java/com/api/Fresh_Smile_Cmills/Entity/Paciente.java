package com.api.Fresh_Smile_Cmills.Entity;

import jakarta.persistence.*;

import java.util.Date;

    @Entity
    @Table(name = "paciente")
    public class Paciente {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_paciente")
        private int id_paciente;
        @Column(name = "tipo_documento_paciente")
        private String tipo_documento_paciente;
        @Column(name = "numero_documento_paciente")
        private int numero_documento_paciente;
        @Column(name = "nombres_paciente")
        private String nombres_paciente;
        @Column(name = "apellidos_paciente")
        private String apellidos_paciente;
        @Column(name = " direccion_paciente")
        private String  direccion_paciente;
        @Column(name = "telefono_paciente")
        private int telefono_paciente;

        @Column(name = "correo_paciente")
        private String correo_paciente;

        @Column(name = "contraseña_paciente")
        private String contraseña_paciente;

        @Column(name = "fecha_registro_paciente")
        private Date fecha_registro_paciente;

        public int getId_paciente() {
            return id_paciente;
        }

        public void setId_paciente(int id_paciente) {
            this.id_paciente = id_paciente;
        }

        public String getTipo_documento_paciente() {
            return tipo_documento_paciente;
        }

        public void setTipo_documento_paciente(String tipo_documento_paciente) {
            this.tipo_documento_paciente = tipo_documento_paciente;
        }

        public int getNumero_documento_paciente() {
            return numero_documento_paciente;
        }

        public void setNumero_documento_paciente(int numero_documento_paciente) {
            this.numero_documento_paciente = numero_documento_paciente;
        }

        public String getNombres_paciente() {
            return nombres_paciente;
        }

        public void setNombres_paciente(String nombres_paciente) {
            this.nombres_paciente = nombres_paciente;
        }

        public String getApellidos_paciente() {
            return apellidos_paciente;
        }

        public void setApellidos_paciente(String apellidos_paciente) {
            this.apellidos_paciente = apellidos_paciente;
        }

        public String getDireccion_paciente() {
            return direccion_paciente;
        }

        public void setDireccion_paciente(String direccion_paciente) {
            this.direccion_paciente = direccion_paciente;
        }

        public int getTelefono_paciente() {
            return telefono_paciente;
        }

        public void setTelefono_paciente(int telefono_paciente) {
            this.telefono_paciente = telefono_paciente;
        }

        public String getCorreo_paciente() {
            return correo_paciente;
        }

        public void setCorreo_paciente(String correo_paciente) {
            this.correo_paciente = correo_paciente;
        }

        public String getContraseña_paciente() {
            return contraseña_paciente;
        }

        public void setContraseña_paciente(String contraseña_paciente) {
            this.contraseña_paciente = contraseña_paciente;
        }

        public Date getFecha_registro_paciente() {
            return fecha_registro_paciente;
        }

        public void setFecha_registro_paciente(Date fecha_registro_paciente) {
            this.fecha_registro_paciente = fecha_registro_paciente;
        }
    }
