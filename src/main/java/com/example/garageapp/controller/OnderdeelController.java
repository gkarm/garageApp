package com.example.garageapp.controller;

import com.example.garageapp.model.Onderdeel;
import com.example.garageapp.repository.OnderdeelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OnderdeelController {
    @Autowired
    OnderdeelRepository repos;

    @GetMapping("/onderdelen")
    public ResponseEntity<Object> getParts() {
        List<Onderdeel> lod = repos.findAll();
        return new ResponseEntity<>(lod, HttpStatus.OK);
    }

    @PostMapping("/onderdelen")
    public ResponseEntity<Object> createPart(@RequestBody Onderdeel od) {
        repos.save(od);
        return new ResponseEntity<>("Onderdeel gemaakt!", HttpStatus.CREATED);

    }
}
