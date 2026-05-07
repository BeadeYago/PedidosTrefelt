package com.pedidos.trefelt.service;

import com.pedidos.trefelt.entity.Station;
import com.pedidos.trefelt.repository.StationRepository;
import org.springframework.stereotype.Service;

@Service
public class StationService {

    public StationService(StationRepository repo){
        this.repo = repo;
    }

    private StationRepository repo;

    public Station save(Station station){
        return repo.save(station);
    }
}
