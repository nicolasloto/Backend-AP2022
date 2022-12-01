package com.portfolio.HNL.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreXP;
    private String descXP;

    public Experiencia() {
    }

    public Experiencia(String nombreXP, String descXP) {
        this.nombreXP = nombreXP;
        this.descXP = descXP;
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

}