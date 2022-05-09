package com.example.garageapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agendas")
public class Agenda {

    @Id
    @GeneratedValue

    Long id;

    String title;
    boolean done;
    int day;
    String month;
    int year;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Agenda() {
    }

    public Agenda(Long id, String title, boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }
}
