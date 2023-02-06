package com.portfolio.HNL.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String nombreXP;
    @NotBlank
    private String descXP;
    @NotBlank
    private String inicioXP;
    @NotBlank
    private String finalXP;
    

    public Experiencia() {
    }

    public Experiencia(String nombreXP, String descXP, String inicioXP, String finalXP) {
        this.nombreXP = nombreXP;
        this.descXP = descXP;
        this.inicioXP = inicioXP;
        this.finalXP = finalXP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getfinalXP() {
        return finalXP;
    }

    public void setfinalXP(String finalXP) {
        this.finalXP = finalXP;
    }
}