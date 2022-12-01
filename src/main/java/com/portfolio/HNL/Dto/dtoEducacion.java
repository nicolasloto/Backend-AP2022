package com.portfolio.HNL.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {

    @NotBlank
    private String nombreEd;
    @NotBlank
    private String descEd;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreEd, String descEd) {
        this.nombreEd = nombreEd;
        this.descEd = descEd;
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
}