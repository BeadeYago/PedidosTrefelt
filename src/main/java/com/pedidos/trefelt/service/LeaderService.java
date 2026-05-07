package com.pedidos.trefelt.service;

import com.pedidos.trefelt.entity.Leader;
import com.pedidos.trefelt.repository.LeaderRepository;
import org.springframework.stereotype.Service;

@Service
public class LeaderService {

    public LeaderService(LeaderRepository repo){
        this.repo = repo;
    }

    private LeaderRepository repo;

    public Leader save(Leader leader){
        return repo.save(leader);
    }
}
