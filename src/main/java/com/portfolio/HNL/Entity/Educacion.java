package com.portfolio.HNL.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String nombreEd;
    @NotBlank
    private String descEd;
    @NotBlank
    private String inicioEd;
    @NotBlank
    private String finalEd;

    public Educacion() {
    }

    public Educacion(String nombreEd, String descEd, String inicioEd, String finalEd) {
        this.nombreEd = nombreEd;
        this.descEd = descEd;
        this.inicioEd = inicioEd;
        this.finalEd = finalEd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
