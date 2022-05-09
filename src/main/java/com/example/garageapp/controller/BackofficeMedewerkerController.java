package com.example.garageapp.controller;

import com.example.garageapp.model.BackofficeMedewerker;
import com.example.garageapp.repository.BackofficeMedewerkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class BackofficeMedewerkerController {

    @Autowired
    BackofficeMedewerkerRepository repos;
    @GetMapping("/boms")
    public ResponseEntity<Object> getBmedewerkers() {
    List<BackofficeMedewerker> lb = repos.findAll();
    return new ResponseEntity<>(lb, HttpStatus.OK);

    }

    @PostMapping("/boms")
    public ResponseEntity<Object> createBmedewerker(@RequestBody BackofficeMedewerker b) {
        repos.save(b);
        return new ResponseEntity<>("BackofficeMedewerker aangemaakt!", HttpStatus.CREATED);

    }
}
