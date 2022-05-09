package com.example.garageapp.service;

import com.example.garageapp.dto.MonteurDto;
import com.example.garageapp.model.Monteur;
import com.example.garageapp.repository.MonteurRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MonteurServiceImpl implements MonteurService {
    private final MonteurRepository repos;

//    connecting repository to service

    public  MonteurServiceImpl(MonteurRepository repos) {
        this.repos = repos;
    }

    @Override
    public List<MonteurDto> getMechanics() {

       List<Monteur> lm = this.repos.findAll();
       List<MonteurDto> mechanics = new ArrayList<>();
//       lambda expression , giving a function as a parameter
//       lm.forEach(m -> mechanics.add(new MonteurDto(m.getId(), m.getFirstName(), m.getLastName(), m.getSalary())));

        for (Monteur m : lm) {
            MonteurDto mdto = new MonteurDto(m.getId(), m.getFirstName(), m.getLastName(), m.getSalary());
            mechanics.add(mdto);
        }

       return mechanics;
    }

    @Override
    public Monteur createMechanic(MonteurDto monteurDto) {
        Monteur m = new Monteur();
        m.setFirstName(monteurDto.getFirstName());
        m.setLastName(monteurDto.getLastName());
        m.setSalary(monteurDto.getSalary());
       return this.repos.save(m);
    }

    @Override
    public Monteur getMechanic(Long id) {
        return repos.findById(id).get();
    }
}
