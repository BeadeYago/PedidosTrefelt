package com.pedidos.trefelt.service;

import com.pedidos.trefelt.entity.Gap;
import com.pedidos.trefelt.repository.GapRepository;
import org.springframework.stereotype.Service;

@Service
public class GapService {

    public GapService(GapRepository repo){
        this.repo = repo;
    }

    private GapRepository repo;

    public Gap save(Gap gap){
        return repo.save(gap);
    }
}
