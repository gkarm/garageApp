package com.example.garageapp.controller;

import com.example.garageapp.dto.MonteurDto;
import com.example.garageapp.model.Monteur;
import com.example.garageapp.service.MonteurService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MonteurController {
    private final MonteurService service;

    public MonteurController(MonteurService service) {
       this.service = service;
   }

    @GetMapping("/monteurs")
    public ResponseEntity<Object> getMechanics() {
       List<MonteurDto> lm = service.getMechanics();
       return new ResponseEntity<>(lm, HttpStatus.OK);

    }

    @PostMapping("/monteurs")
    public ResponseEntity<Object> createMechanic(@Valid @RequestBody MonteurDto mdto, BindingResult br) {
        if (br.hasErrors()) {
            StringBuilder sb = new StringBuilder();
            for (FieldError fe : br.getFieldErrors()) {
                sb.append(fe.getDefaultMessage());
                sb.append("\n");
            }
            return new ResponseEntity<> (sb.toString(), HttpStatus.BAD_REQUEST);

        } else {
            service.createMechanic(mdto);
            return new ResponseEntity<>("Monteur aangemaakt!", HttpStatus.CREATED);
        }

    }

    @GetMapping("/monteurs/{id}/autos")
    public ResponseEntity<Object> getMechanicAutos(@PathVariable(name = "id") Long monteurId) {
       Monteur monteur = service.getMechanic(monteurId);
       return new ResponseEntity<> (monteur.getAutos(), HttpStatus.OK);

    }


}
