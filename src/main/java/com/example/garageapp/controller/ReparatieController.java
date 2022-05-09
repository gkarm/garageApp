package com.example.garageapp.controller;

import com.example.garageapp.model.Reparatie;
import com.example.garageapp.repository.ReparatieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReparatieController {
    @Autowired
    ReparatieRepository repos;

    @GetMapping("/reparaties")
    public ResponseEntity<Object> getFabrics() {
        List<Reparatie> lr = repos.findAll();
        return new ResponseEntity<>(lr, HttpStatus.OK);
    }

    @PostMapping("/reparaties")
    public ResponseEntity<Object> createFabric(@RequestBody Reparatie r) {
        repos.save(r);
        return new ResponseEntity<>("Reparatie uitgevoer!", HttpStatus.CREATED);

    }
}
