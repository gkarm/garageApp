package com.example.garageapp.repository;

import com.example.garageapp.model.Klant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KlantRepository extends JpaRepository<Klant, Long> {
}
