package com.example.garageapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "monteurs")
public class Monteur {

    @Id
    @GeneratedValue
    Long id;



    @NotBlank
    String firstName;

    String lastName;

    int salary;

//    Bidirectionnel relation setting between Monteur Entity One to Auto Entity Many

    @OneToMany(mappedBy = "monteur")
//            To Avoid recursion we use JsonIgnore
    @JsonIgnore
    List<Auto> Autos;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Auto> getAutos() {
        return Autos;
    }

    public void setAutos(List<Auto> autos) {
        this.Autos = autos;
    }
}
