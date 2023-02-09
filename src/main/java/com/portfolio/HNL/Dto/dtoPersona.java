package com.portfolio.HNL.Dto;

import javax.validation.constraints.NotBlank;

public class dtoPersona {
    
@NotBlank
    private String nombre;
@NotBlank
    private String titulo;
@NotBlank
    private String descripcion;

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String titulo, String descripcion) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}