package com.portfolio.HNL.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {

    @NotBlank
    private String nombreXP;
    private String descXP;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreXP, String descXP) {
        this.nombreXP = nombreXP;
        this.descXP = descXP;
    }

    public String getNombreXP() {
        return nombreXP;
    }

    public void setNombreXP(String nombreXP) {
        this.nombreXP = nombreXP;
    }

    public String getDescXP() {
        return descXP;
    }

    public void setDescXP(String descXP) {
        this.descXP = descXP;
    }

}