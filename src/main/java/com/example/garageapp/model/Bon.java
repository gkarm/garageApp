package com.example.garageapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bonnen")
public class Bon {

    @Id
    @GeneratedValue
    Long id;

    int bonNummer;
    String firstName;
    String lastName;
    String betalling;

    public Bon() {
    }

    public Bon(Long id, int bonNummer, String firstName, String lastName, String betalling) {
        this.id = id;
        this.bonNummer = bonNummer;
        this.firstName = firstName;
        this.lastName = lastName;
        this.betalling = betalling;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getBonNummer() {
        return bonNummer;
    }

    public void setBonNummer(int bonNummer) {
        this.bonNummer = bonNummer;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBetalling() {
        return betalling;
    }

    public void setBetalling(String betalling) {
        this.betalling = betalling;
    }
}
