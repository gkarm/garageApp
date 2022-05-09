package com.example.garageapp.repository;

import com.example.garageapp.model.Bon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BonRepository extends JpaRepository<Bon, Long> {
}
