package com.example.garageapp.controller;


import com.example.garageapp.model.Auto;
import com.example.garageapp.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController

public class AutoController {
    @Autowired
    AutoRepository repos;

    @GetMapping("/autos")
    public ResponseEntity<Object> getVehicles() {
     List<Auto> la = repos.findAll();
     return new ResponseEntity<>(la, HttpStatus.OK);
    }

    @PostMapping("/autos")
    public ResponseEntity<Object> createVehicle(@Valid @RequestBody Auto a) {
        repos.save(a);
        return new ResponseEntity<>("auto aangemaakt!", HttpStatus.CREATED);
    }
}
