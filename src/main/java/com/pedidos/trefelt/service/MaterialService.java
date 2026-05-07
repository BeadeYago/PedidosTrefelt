package com.pedidos.trefelt.service;

import com.pedidos.trefelt.entity.Material;
import com.pedidos.trefelt.repository.MaterialRepository;
import org.springframework.stereotype.Service;

@Service
public class MaterialService {

    public MaterialService(MaterialRepository repo){
        this.repo = repo;
    }

    private MaterialRepository repo;

    public Material save(Material material){
        return repo.save(material);
    }
}
