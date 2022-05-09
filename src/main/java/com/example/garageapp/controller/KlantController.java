package com.example.garageapp.controller;

import com.example.garageapp.model.Klant;
import com.example.garageapp.repository.KlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KlantController {
    @Autowired
    KlantRepository repos;

    @GetMapping("/klanten")
    public ResponseEntity<Object> getClients() {
      List<Klant> lkl = repos.findAll();
      return new ResponseEntity<>(lkl, HttpStatus.OK);

    }

    @PostMapping("/klanten")
    public ResponseEntity<Object> createClient(@RequestBody Klant kl) {
        repos.save(kl);
        return new ResponseEntity<>("Klant aangemaakt!", HttpStatus.CREATED);
    }
}
