package com.portfolio.HNL.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {

    @NotBlank
    private String nombreXP;
    @NotBlank
    private String descXP;
    @NotBlank
    private String inicioXP;
    @NotBlank
    private String finalXP;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreXP, String descXP, String inicioXP, String finalXP) {
        this.nombreXP = nombreXP;
        this.descXP = descXP;
        this.inicioXP = inicioXP;
        this.finalXP = finalXP;
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

    public String getInicioXP() {
        return inicioXP;
    }

    public void setInicioXP(String inicioXP) {
        this.inicioXP = inicioXP;
    }

    public String getFinalXP() {
        return finalXP;
    }

    public void setFinalXP(String finalXP) {
        this.finalXP = finalXP;
    }
}