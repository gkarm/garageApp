package com.example.garageapp.model;


import javax.persistence.*;

@Entity
@Table(name = "autos")
public class Auto {
    @Id
    @GeneratedValue
    Long id;

    String autoName;
    String autoModel;
    String ownerName;
    int registratieNummer;

//    Connecting Monteur Entity to Auto Entity with the relation Many to One- Many auto side- one monteur side.

    @ManyToOne
    @JoinColumn(name = "monteur_id")
    Monteur monteur;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutoName() {
        return autoName;
    }

    public void setAutoName(String autoName) {
        this.autoName = autoName;
    }

    public String getAutoModel() {
        return autoModel;
    }

    public void setAutoModel(String autoModel) {
        this.autoModel = autoModel;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getRegistratieNummer() {
        return registratieNummer;
    }

    public void setRegistratieNummer(int registratieNummer) {
        this.registratieNummer = registratieNummer;
    }


    public Monteur getMonteur() {
        return monteur;
    }

    public void setMonteur(Monteur monteur) {
        this.monteur = monteur;
    }

}
