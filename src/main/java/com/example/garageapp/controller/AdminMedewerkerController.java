package com.example.garageapp.controller;


import com.example.garageapp.model.AdminMedewerker;
import com.example.garageapp.repository.AdminMedewerkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminMedewerkerController {
    @Autowired
    AdminMedewerkerRepository repos;

    @GetMapping("/adminmedewerkers")
    public ResponseEntity<Object> getWorkers() {
      List<AdminMedewerker> lad = repos.findAll();
      return new ResponseEntity<>(lad, HttpStatus.OK);

    }

    @PostMapping("/adminmedewerkers")
    public ResponseEntity<Object> createWorker(@RequestBody AdminMedewerker ad) {
        repos.save(ad);
        return new ResponseEntity<>("AdminMedewerker aangemakt!", HttpStatus.CREATED);
    }
}
