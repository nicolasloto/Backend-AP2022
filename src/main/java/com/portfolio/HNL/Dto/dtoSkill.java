package com.portfolio.HNL.Dto;

import javax.validation.constraints.NotBlank;


public class dtoSkill {
    @NotBlank
    private String nombre;
    @NotBlank
    private int percent;

    public dtoSkill() {
    }

    public dtoSkill(String nombre, int percent) {
        this.nombre = nombre;
        this.percent = percent;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }   
}