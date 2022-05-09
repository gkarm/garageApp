package com.example.garageapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reparaties")
public class Reparatie {

    @Id
    @GeneratedValue

    Long id;
    String actie;

    public Reparatie() {
    }

    public Reparatie(Long id, String actie) {
        this.id = id;
        this.actie = actie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActie() {
        return actie;
    }

    public void setActie(String actie) {
        this.actie = actie;
    }
}
