package com.example.garageapp.controller;

import com.example.garageapp.model.Agenda;
import com.example.garageapp.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/agendas")
public class AgendaController {

    @Autowired
    AgendaRepository repos;

    @GetMapping
    public List<Agenda> findAll() {
        return repos.findAll();
    }

    @PostMapping
    public Agenda save( @NonNull @RequestBody Agenda agd) {
        return repos.save(agd);

    }
    @PutMapping
    public Agenda update(@NonNull @RequestBody Agenda agd) {
        return repos.save(agd);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        repos.deleteById(id);
    }
}
