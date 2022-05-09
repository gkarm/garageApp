package com.example.garageapp.repository;

import com.example.garageapp.model.Onderdeel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OnderdeelRepository extends JpaRepository<Onderdeel, Long> {
}
