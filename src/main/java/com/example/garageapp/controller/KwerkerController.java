package com.example.garageapp.controller;

import com.example.garageapp.model.Kwerker;
import com.example.garageapp.repository.KwerkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KwerkerController {
    @Autowired
    KwerkerRepository repos;

    @GetMapping("/kwerkers")
    public ResponseEntity<Object> getCaissiers() {
      List<Kwerker> lk = repos.findAll();
      return new ResponseEntity<>(lk, HttpStatus.OK);
    }

    @PostMapping("/kwerkers")
    public ResponseEntity<Object> createCaissier(@RequestBody Kwerker k) {
        repos.save(k);
        return new ResponseEntity<>("Kwerker aangemaakt", HttpStatus.CREATED);



    }
}
