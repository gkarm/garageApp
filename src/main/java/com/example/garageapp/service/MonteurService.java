package com.example.garageapp.service;

import com.example.garageapp.dto.MonteurDto;
import com.example.garageapp.model.Monteur;

import java.util.List;

public interface MonteurService {
    public List<MonteurDto> getMechanics();
    public Monteur getMechanic(Long id);
    public Monteur createMechanic(MonteurDto monteurDto);

}
