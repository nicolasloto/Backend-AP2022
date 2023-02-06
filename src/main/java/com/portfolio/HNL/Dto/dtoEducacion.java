package com.portfolio.HNL.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {

    @NotBlank
    private String nombreEd;
    @NotBlank
    private String descEd;
    @NotBlank
    private String inicioEd;
    @NotBlank
    private String finalEd;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreEd, String descEd, String inicioEd, String finalEd) {
        this.nombreEd = nombreEd;
        this.descEd = descEd;
        this.inicioEd = inicioEd;
        this.finalEd = finalEd;
    }

    public String getNombreEd() {
        return nombreEd;
    }

    public void setNombreEd(String nombreEd) {
        this.nombreEd = nombreEd;
    }

    public String getDescEd() {
        return descEd;
    }

    public void setDescEd(String descEd) {
        this.descEd = descEd;
    }

    public String getInicioEd() {
        return inicioEd;
    }

    public void setInicioEd(String inicioEd) {
        this.inicioEd = inicioEd;
    }

    public String getFinalEd() {
        return finalEd;
    }

    public void setFinalEd(String finalEd) {
        this.finalEd = finalEd;
    }
}