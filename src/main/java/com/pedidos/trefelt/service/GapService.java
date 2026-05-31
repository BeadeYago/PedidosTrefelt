package com.pedidos.trefelt.service;

import com.pedidos.trefelt.entity.Gap;
import com.pedidos.trefelt.repository.GapRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GapService {

    public GapService(GapRepository repo){
        this.repo = repo;
    }

    private GapRepository repo;

    public Gap save(Gap gap){
        return repo.save(gap);
    }

    public Gap findById(Integer id){
         final Gap gap = repo.findById(id).orElseThrow(() ->
                new EntityNotFoundException("No se encontro nada"));
        return gap;
    }

}
