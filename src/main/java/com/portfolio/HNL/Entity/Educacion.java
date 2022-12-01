package com.portfolio.HNL.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreEd;
    private String descEd;

    public Educacion() {
    }

    public Educacion(String nombreEd, String descEd) {
        this.nombreEd = nombreEd;
        this.descEd = descEd;
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
}