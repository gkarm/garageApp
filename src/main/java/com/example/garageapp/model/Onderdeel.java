package com.example.garageapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "onderdelen")
public class Onderdeel {

    @Id
    @GeneratedValue
    Long id;

    String name;
    int quantity;
    int prijs;
    int btw;

    public Onderdeel() {
    }

    public Onderdeel(Long id, String name, int quantity, int prijs, int btw) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.prijs = prijs;
        this.btw = btw;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrijs() {
        return prijs;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    public int getBtw() {
        return btw;
    }

    public void setBtw(int btw) {
        this.btw = btw;
    }
}
