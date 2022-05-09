package com.example.garageapp.controller;

import com.example.garageapp.model.Bon;
import com.example.garageapp.repository.BonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BonController {
    @Autowired
    BonRepository repos;

    @GetMapping("/bonnen")
    public ResponseEntity<Object> getTickets() {
        List<Bon> lbo = repos.findAll();
        return new ResponseEntity<>(lbo, HttpStatus.OK);

    }

    @PostMapping("/bonnen")
    public ResponseEntity<Object> createTicket(@RequestBody Bon bo) {
        repos.save(bo);
        return new ResponseEntity<>("Bon aangemaakt!", HttpStatus.CREATED);

    }
}
